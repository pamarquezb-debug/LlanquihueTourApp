package model;

/**
 * Representa un paseo lacustre turístico.
 */
public class PaseoLacustre extends ServicioTuristico {

    private String tipoEmbarcacion;

    public PaseoLacustre(String nombre, double duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Paseo Lacustre");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Duración: " + getDuracionHoras() + " horas");
        System.out.println("Tipo de embarcación: " + tipoEmbarcacion);
        System.out.println("--------------------------------");
    }

    @Override
    public String toString() {
        return "Paseo Lacustre -> " + super.toString() +
                ", Tipo de embarcación: " + tipoEmbarcacion;
    }
}