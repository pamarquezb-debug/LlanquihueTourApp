package data;

import model.Registrable;
import model.GuiaTuristico;
import model.Vehiculo;
import model.ColaboradorExterno;

import java.util.ArrayList;

/**
 * Gestiona las entidades registrables del sistema.
 */
public class GestorEntidades {

    private ArrayList<Registrable> entidades;

    public GestorEntidades() {
        entidades = new ArrayList<>();
    }

    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }

    public ArrayList<Registrable> getEntidades() {
        return entidades;
    }

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