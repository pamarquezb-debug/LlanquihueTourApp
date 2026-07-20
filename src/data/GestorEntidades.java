package data;

import model.Registrable;
import model.GuiaTuristico;
import model.Vehiculo;
import model.ColaboradorExterno;

import java.util.ArrayList;

/**
 * Clase encargada de administrar todas las entidades registrables del sistema.
 * <p>
 * Permite agregar entidades, obtener la colección completa y mostrar un
 * resumen de todos los registros almacenados, identificando su tipo mediante
 * el uso de {@code instanceof}.
 * </p>
 *
 * @author Pablo Márquez
 * @version 1.0
 */
public class GestorEntidades {

    /**
     * Lista que almacena todas las entidades registradas.
     */
    private ArrayList<Registrable> entidades;

    /**
     * Crea un nuevo gestor de entidades con una colección vacía.
     */
    public GestorEntidades() {
        entidades = new ArrayList<>();
    }

    /**
     * Agrega una nueva entidad registrable a la colección.
     *
     * @param entidad Objeto que implementa la interfaz {@link Registrable}.
     */
    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }

    /**
     * Obtiene la lista completa de entidades registradas.
     *
     * @return Lista de objetos que implementan la interfaz {@link Registrable}.
     */
    public ArrayList<Registrable> getEntidades() {
        return entidades;
    }

    /**
     * Genera un resumen con todas las entidades registradas.
     * <p>
     * El método identifica el tipo real de cada objeto utilizando
     * {@code instanceof} y muestra la información correspondiente mediante
     * el método {@code mostrarResumen()} definido en la interfaz
     * {@link Registrable}.
     * </p>
     *
     * @return Una cadena con el resumen de todas las entidades registradas,
     * o el mensaje "No existen entidades registradas." si la colección está vacía.
     */
    public String mostrarTodasLasEntidades() {
        StringBuilder resumen = new StringBuilder();

        for (Registrable entidad : entidades) {

            if (entidad instanceof GuiaTuristico) {
                resumen.append("[Tipo detectado: Guía Turístico]\n");
            } else if (entidad instanceof Vehiculo) {
                resumen.append("[Tipo detectado: Vehículo]\n");
            } else if (entidad instanceof ColaboradorExterno) {
                resumen.append("[Tipo detectado: Colaborador Externo]\n");
            }

            resumen.append(entidad.mostrarResumen()).append("\n\n");
        }

        if (resumen.length() == 0) {
            return "No existen entidades registradas.";
        }

        return resumen.toString();
    }
}