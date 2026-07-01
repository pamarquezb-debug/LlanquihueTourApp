package model;

/**
 * Representa una ruta gastronómica turística.
 */
public class RutaGastronomica extends ServicioTuristico {

    private int numeroDeParadas;

    public RutaGastronomica(String nombre, double duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Ruta Gastronómica");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Duración: " + getDuracionHoras() + " horas");
        System.out.println("Número de paradas: " + numeroDeParadas);
        System.out.println("--------------------------------");
    }

    @Override
    public String toString() {
        return "Ruta Gastronómica -> " + super.toString() +
                ", Número de paradas: " + numeroDeParadas;
    }
}