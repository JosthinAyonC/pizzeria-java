package com.mycompany.actividad2.pizzeria;

import clases.Ingrediente;
import clases.Pizza;
import java.util.Scanner;

public class Actividad2Pizzeria {

    public static void main(String[] args) {
        //librerias
        Scanner sc = new Scanner(System.in);
        //objetos
        Pizza pizza = new Pizza();
        //variables
        boolean flag = true;
        int numero = 0;
        String ingr = "";
        double precio = 0;
        //codigo

        while (flag == true) {
            System.out.print("Ingrese la cantidad de ingredientes que desea para la Pizza: ");

            if (sc.hasNextInt()) {
                numero = sc.nextInt();

                flag = false;
                break;
            } else {
                System.out.println("///Ingrese una opcion valida.///");
                sc.next();

            }
        }

        sc.nextLine();
        for (int i = 0; i < numero; i++) {

            while (flag == false) {

                System.out.println("Ingrese la descipcion del ingrediente " + (i + 1) + " de su Pizza: ");

                ingr = sc.nextLine();

                while (flag == false) {

                    System.out.println("Ingrese el valor de su ingrediente " + ingr + ": ");
                    if (sc.hasNextDouble()) {
                        precio = sc.nextDouble();
                        sc.nextLine();
                        flag = true;
                        break;

                    } else {

                        System.out.print("\n///Por favor ingrese un valor valido.///\n ");
                        sc.next();

                    }
                }
                System.out.println(" Pizza con ingrediente: " + ingr + "; con un valor: " + precio
                        + "\n---------------------------------------------------\n");
                pizza.agregarIngrediente(new Ingrediente(ingr, precio));
            }
            flag = false;
        }
        
        System.out.println("*********INFORMACION DE LA PIZZA*********\n"
                + String.format("%-30s%s", "Ingredientes", "Precio"));
        for (Ingrediente ingrediente : pizza.getIngredientes()) {
            System.out.println(String.format("%-30s%.2f", ingrediente.getDescripcion(), ingrediente.getPrecio()));
        }
        
        System.out.println("______________________________");
        double costo = pizza.calcularCosto();
        System.out.println("Precio final: " + costo);
    }
}
