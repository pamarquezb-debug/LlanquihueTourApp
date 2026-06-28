package model;

public class PaseoLacustre extends ServicioTuristico {
    private String tipoEmbarcacion;

    public PaseoLacustre(String nombre, double duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public String toString() {
        return "Paseo Lacustre -> " + super.toString() +
                ", Tipo de embarcación: " + tipoEmbarcacion;
    }
}