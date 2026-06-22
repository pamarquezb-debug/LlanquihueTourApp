package model;

public class Tour {
    private String nombre;
    private String ubicacion;
    private int precio;

    public Tour(String nombre, String ubicacion, int precio) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tour: " + nombre +
                " | Ubicación: " + ubicacion +
                " | Precio: $" + precio;
    }
}