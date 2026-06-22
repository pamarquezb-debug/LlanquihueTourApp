package app;

import model.Tour;
import service.TourService;
import util.ArchivoUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Tour> tours = ArchivoUtil.cargarTours("resources/tours.txt");
        TourService servicio = new TourService(tours);

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Llanquihue Tour App ===");
        System.out.println("\nListado de tours disponibles:");
        servicio.mostrarTours();

        System.out.print("\nIngrese el nombre de un tour para buscar: ");
        String busqueda = scanner.nextLine();

        System.out.println("\nResultado de la búsqueda:");
        servicio.buscarPorNombre(busqueda);

        scanner.close();
    }
}