package Clases;
public abstract class Producto {
    private double precio;
    private String nombre;

    public Producto(String nombre, double precio){this.nombre=nombre;this.precio=precio;}

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}