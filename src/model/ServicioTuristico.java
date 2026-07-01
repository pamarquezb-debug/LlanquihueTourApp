package model;

/**
 * Representa un servicio turístico genérico.
 * Actúa como superclase para los distintos tipos de servicios turísticos.
 *
 * @author Pablo Márquez Barría
 * @version 1.0
 */
public class ServicioTuristico {

    private String nombre;
    private double duracionHoras;

    /**
     * Constructor de la clase ServicioTuristico.
     *
     * @param nombre nombre del servicio turístico.
     * @param duracionHoras duración del servicio en horas.
     */
    public ServicioTuristico(String nombre, double duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDuracionHoras() {
        return duracionHoras;
    }

    /**
     * Muestra la información general del servicio turístico.
     * Este método será sobrescrito por las subclases.
     */
    public void mostrarInformacion() {
        System.out.println("Servicio Turístico: " + nombre);
        System.out.println("Duración: " + duracionHoras + " horas");
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Duración: " + duracionHoras + " horas";
    }
}