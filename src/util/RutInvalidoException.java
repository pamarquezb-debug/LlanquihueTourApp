package util;

/**
 * Excepción personalizada utilizada cuando un RUT
 * no cumple con las condiciones de validación.
 *
 * @author Pablo Márquez Barría
 * @version 1.0
 */
public class RutInvalidoException extends Exception {

    public RutInvalidoException(String mensaje) {
        super(mensaje);
    }
}