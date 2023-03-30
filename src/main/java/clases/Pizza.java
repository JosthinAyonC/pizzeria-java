
package clases;

import java.util.ArrayList;

public class Pizza {
    private ArrayList<Ingrediente> ingredientes;
    
    public Pizza() {
        this.ingredientes = new ArrayList<>();
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }
    
    public void agregarIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }
    
    public double calcularCosto() {
        double costo = 0;
        for (Ingrediente ingrediente : this.ingredientes) {
            costo += ingrediente.getPrecio();
        }
        return costo;
    }

    @Override
    public String toString() {
        return "Pizza{" + "ingredientes=" + ingredientes + '}';
    }
}