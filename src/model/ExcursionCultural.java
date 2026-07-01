package model;

/**
 * Representa una excursión cultural turística.
 */
public class ExcursionCultural extends ServicioTuristico {

    private String lugarHistorico;

    public ExcursionCultural(String nombre, double duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Excursión Cultural");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Duración: " + getDuracionHoras() + " horas");
        System.out.println("Lugar histórico: " + lugarHistorico);
        System.out.println("--------------------------------");
    }

    @Override
    public String toString() {
        return "Excursión Cultural -> " + super.toString() +
                ", Lugar histórico: " + lugarHistorico;
    }
}