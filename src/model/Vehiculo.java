package model;

/**
 * Representa un vehículo utilizado por la agencia.
 */
public class Vehiculo implements Registrable {

    private String patente;
    private String tipoVehiculo;
    private int capacidadPasajeros;

    public Vehiculo(String patente, String tipoVehiculo, int capacidadPasajeros) {
        this.patente = patente;
        this.tipoVehiculo = tipoVehiculo;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getPatente() {
        return patente;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    @Override
    public String mostrarResumen() {
        return "Vehículo\n" +
                "Patente: " + patente + "\n" +
                "Tipo: " + tipoVehiculo + "\n" +
                "Capacidad: " + capacidadPasajeros + " pasajeros";
    }
}