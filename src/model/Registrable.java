package model;

/**
 * Interfaz que define un comportamiento común
 * para las entidades registrables del sistema.
 */
public interface Registrable {

    /**
     * Muestra un resumen de la entidad.
     *
     * @return resumen de la entidad.
     */
    String mostrarResumen();
}