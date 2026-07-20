package model;

import util.RutInvalidoException;

/**
 * Representa el RUT de una persona o entidad.
 * Se encarga de validar y almacenar el RUT.
 *
 * @author Pablo Márquez Barría
 * @version 1.0
 */
public class Rut {

    private String valor;

    /**
     * Construye un objeto Rut.
     *
     * @param valor RUT ingresado.
     * @throws RutInvalidoException cuando el RUT no tiene un formato válido.
     */
    public Rut(String valor) throws RutInvalidoException {
        setValor(valor);
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) throws RutInvalidoException {

        if (valor == null || valor.isBlank()) {
            throw new RutInvalidoException(
                    "El RUT no puede estar vacío."
            );
        }

        String rutLimpio = valor
                .replace(".", "")
                .replace("-", "")
                .trim()
                .toUpperCase();

        if (!rutLimpio.matches("\\d{7,8}[0-9K]")) {
            throw new RutInvalidoException(
                    "El formato del RUT no es válido."
            );
        }

        if (!validarDigitoVerificador(rutLimpio)) {
            throw new RutInvalidoException(
                    "El dígito verificador del RUT es incorrecto."
            );
        }

        this.valor = formatearRut(rutLimpio);
    }

    /**
     * Valida el dígito verificador utilizando el algoritmo módulo 11.
     */
    private boolean validarDigitoVerificador(String rutLimpio) {

        String cuerpo = rutLimpio.substring(
                0,
                rutLimpio.length() - 1
        );

        char digitoIngresado = rutLimpio.charAt(
                rutLimpio.length() - 1
        );

        int suma = 0;
        int multiplicador = 2;

        for (int i = cuerpo.length() - 1; i >= 0; i--) {
            suma += Character.getNumericValue(
                    cuerpo.charAt(i)
            ) * multiplicador;

            multiplicador++;

            if (multiplicador == 8) {
                multiplicador = 2;
            }
        }

        int resto = 11 - (suma % 11);
        char digitoCalculado;

        if (resto == 11) {
            digitoCalculado = '0';
        } else if (resto == 10) {
            digitoCalculado = 'K';
        } else {
            digitoCalculado = Character.forDigit(resto, 10);
        }

        return digitoIngresado == digitoCalculado;
    }

    /**
     * Agrega puntos y guion al RUT.
     */
    private String formatearRut(String rutLimpio) {

        String cuerpo = rutLimpio.substring(
                0,
                rutLimpio.length() - 1
        );

        char digitoVerificador = rutLimpio.charAt(
                rutLimpio.length() - 1
        );

        StringBuilder resultado = new StringBuilder(cuerpo);

        for (int i = resultado.length() - 3; i > 0; i -= 3) {
            resultado.insert(i, ".");
        }

        return resultado + "-" + digitoVerificador;
    }

    @Override
    public String toString() {
        return valor;
    }
}