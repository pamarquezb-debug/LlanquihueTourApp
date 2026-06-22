package service;

import model.Tour;
import java.util.ArrayList;

public class TourService {
    private ArrayList<Tour> tours;

    public TourService(ArrayList<Tour> tours) {
        this.tours = tours;
    }

    public void mostrarTours() {
        for (Tour tour : tours) {
            System.out.println(tour);
        }
    }

    public void buscarPorNombre(String nombreBuscado) {
        boolean encontrado = false;

        for (Tour tour : tours) {
            if (tour.getNombre().toLowerCase().contains(nombreBuscado.toLowerCase())) {
                System.out.println(tour);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún tour con ese nombre.");
        }
    }
}