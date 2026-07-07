package model;

/**
 * Representa un guía turístico de la agencia.
 */
public class GuiaTuristico extends Persona implements Registrable {

    private String especialidad;

    public GuiaTuristico(String nombre, String rut, String especialidad) {
        super(nombre, rut);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String mostrarResumen() {
        return "Guía Turístico\n" +
                "Nombre: " + getNombre() + "\n" +
                "RUT: " + getRut() + "\n" +
                "Especialidad: " + especialidad;
    }
}