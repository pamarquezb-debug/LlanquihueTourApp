package model;

/**
 * Representa un colaborador externo de la agencia.
 */
public class ColaboradorExterno extends Persona implements Registrable {

    private String servicioPrestado;

    public ColaboradorExterno(String nombre, String rut, String servicioPrestado) {
        super(nombre, rut);
        this.servicioPrestado = servicioPrestado;
    }

    @Override
    public String mostrarResumen() {
        return "Colaborador Externo\n" +
                "Nombre: " + getNombre() + "\n" +
                "RUT: " + getRut() + "\n" +
                "Servicio prestado: " + servicioPrestado;
    }
}