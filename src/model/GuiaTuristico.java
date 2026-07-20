package model;

/**
 * Representa un guía turístico de la agencia.
 */
public class GuiaTuristico extends Persona implements Registrable {

    private String especialidad;

    public GuiaTuristico(
            String nombre,
            Rut rut,
            Direccion direccion,
            String especialidad) {

        super(nombre, rut, direccion);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String mostrarResumen() {
        return "Guía Turístico\n" +
                "Nombre: " + getNombre() + "\n" +
                "RUT: " + getRut() + "\n" +
                "Dirección: " + getDireccion() + "\n" +
                "Especialidad: " + especialidad;
    }

    @Override
    public String toString() {
        return mostrarResumen();
    }
}