package ui;

import data.GestorEntidades;
import model.GuiaTuristico;
import model.Vehiculo;

import javax.swing.JOptionPane;

/**
 * Clase principal con interfaz gráfica simple.
 */
public class Main {

    public static void main(String[] args) {

        GestorEntidades gestor = new GestorEntidades();
        int opcion;

        do {
            String menu = """
                    === LlanquihueTourApp ===

                    1. Registrar Guía Turístico
                    2. Registrar Vehículo
                    3. Mostrar registros
                    4. Salir

                    Seleccione una opción:
                    """;

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    String nombre = JOptionPane.showInputDialog("Ingrese nombre del guía:");
                    String rut = JOptionPane.showInputDialog("Ingrese RUT del guía:");
                    String especialidad = JOptionPane.showInputDialog("Ingrese especialidad del guía:");

                    gestor.agregarEntidad(new GuiaTuristico(nombre, rut, especialidad));
                    JOptionPane.showMessageDialog(null, "Guía registrado correctamente.");
                    break;

                case 2:
                    String patente = JOptionPane.showInputDialog("Ingrese patente del vehículo:");
                    String tipo = JOptionPane.showInputDialog("Ingrese tipo de vehículo:");
                    int capacidad = Integer.parseInt(
                            JOptionPane.showInputDialog("Ingrese capacidad de pasajeros:")
                    );

                    gestor.agregarEntidad(new Vehiculo(patente, tipo, capacidad));
                    JOptionPane.showMessageDialog(null, "Vehículo registrado correctamente.");
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, gestor.mostrarTodasLasEntidades());
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Programa finalizado.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }

        } while (opcion != 4);
    }
}