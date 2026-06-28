package data;

import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

public class GestorServicios {

    public void mostrarServiciosDePrueba() {
        RutaGastronomica ruta1 = new RutaGastronomica("Sabores de Llanquihue", 3, 4);
        RutaGastronomica ruta2 = new RutaGastronomica("Ruta del Kuchen", 2.5, 3);

        PaseoLacustre paseo1 = new PaseoLacustre("Paseo por el Lago Llanquihue", 2, "Lancha turística");
        PaseoLacustre paseo2 = new PaseoLacustre("Navegación al atardecer", 1.5, "Catamarán");

        ExcursionCultural excursion1 = new ExcursionCultural("Historia de Frutillar", 2, "Teatro del Lago");
        ExcursionCultural excursion2 = new ExcursionCultural("Patrimonio Alemán", 3, "Museo Colonial Alemán");

        System.out.println(ruta1);
        System.out.println(ruta2);
        System.out.println(paseo1);
        System.out.println(paseo2);
        System.out.println(excursion1);
        System.out.println(excursion2);
    }
}