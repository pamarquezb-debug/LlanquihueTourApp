package data;

import model.ServicioTuristico;
import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada de gestionar los servicios turísticos del sistema.
 */
public class GestorServicios {

    /**
     * Crea una lista polimórfica de servicios turísticos.
     *
     * @return lista de servicios turísticos.
     */
    public List<ServicioTuristico> obtenerServicios() {
        List<ServicioTuristico> servicios = new ArrayList<>();

        servicios.add(new RutaGastronomica("Sabores de Llanquihue", 3, 4));
        servicios.add(new RutaGastronomica("Ruta del Kuchen", 2.5, 3));
        servicios.add(new PaseoLacustre("Paseo por el Lago Llanquihue", 2, "Lancha turística"));
        servicios.add(new PaseoLacustre("Navegación al atardecer", 1.5, "Catamarán"));
        servicios.add(new ExcursionCultural("Patrimonio Alemán", 3, "Museo Colonial Alemán"));

        return servicios;
    }

    /**
     * Recorre la colección y muestra la información usando polimorfismo.
     */
    public void mostrarServicios() {
        List<ServicioTuristico> servicios = obtenerServicios();

        for (ServicioTuristico servicio : servicios) {
            servicio.mostrarInformacion();
        }
    }
}