package model;

/**
 * Representa un colaborador externo de la agencia.
 */
public class ColaboradorExterno extends Persona implements Registrable {

    private String servicioPrestado;

    public ColaboradorExterno(
            String nombre,
            Rut rut,
            Direccion direccion,
            String servicioPrestado) {

        super(nombre, rut, direccion);
        this.servicioPrestado = servicioPrestado;
    }

    public String getServicioPrestado() {
        return servicioPrestado;
    }

    public void setServicioPrestado(String servicioPrestado) {
        this.servicioPrestado = servicioPrestado;
    }

    @Override
    public String mostrarResumen() {
        return "Colaborador Externo\n" +
                "Nombre: " + getNombre() + "\n" +
                "RUT: " + getRut() + "\n" +
                "Dirección: " + getDireccion() + "\n" +
                "Servicio prestado: " + servicioPrestado;
    }

    @Override
    public String toString() {
        return mostrarResumen();
    }
}