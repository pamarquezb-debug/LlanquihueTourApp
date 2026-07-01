package ui;

import data.GestorServicios;

/**
 * Clase principal del sistema LlanquihueTourApp.
 */
public class Main {

    public static void main(String[] args) {
        GestorServicios gestor = new GestorServicios();

        System.out.println("=== Servicios Turísticos LlanquihueTourApp ===");
        gestor.mostrarServicios();
    }
}