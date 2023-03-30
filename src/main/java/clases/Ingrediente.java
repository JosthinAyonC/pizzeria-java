
package clases;

public class Ingrediente {
    private String descripcion;
    private double precio;
    
    public Ingrediente(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public double getPrecio() {
        return precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}