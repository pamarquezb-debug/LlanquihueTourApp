package util;

import model.Tour;
import java.io.*;
import java.util.ArrayList;

public class ArchivoUtil {

    public static ArrayList<Tour> cargarTours(String rutaArchivo) {
        ArrayList<Tour> tours = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");

                if (datos.length == 3) {
                    String nombre = datos[0];
                    String ubicacion = datos[1];
                    int precio = Integer.parseInt(datos[2]);

                    tours.add(new Tour(nombre, ubicacion, precio));
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error en el formato del precio.");
        }

        return tours;
    }
}