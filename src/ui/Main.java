package ui;

import data.GestorEntidades;
import model.GuiaTuristico;
import model.Vehiculo;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    private GestorEntidades gestor;
    private JList<String> listaMenu;

    public Main() {
        gestor = new GestorEntidades();

        setTitle("LlanquihueTourApp");
        setSize(480, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel titulo = new JLabel("LlanquihueTourApp", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        titulo.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));
        add(titulo, BorderLayout.NORTH);

        String[] opciones = {
                "Registrar Guía Turístico",
                "Registrar Vehículo",
                "Mostrar Registros",
                "Salir"
        };

        listaMenu = new JList<>(opciones);
        listaMenu.setFont(new Font("Arial", Font.PLAIN, 16));
        listaMenu.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaMenu.setSelectedIndex(0);
        listaMenu.setFixedCellHeight(45);

        JScrollPane scroll = new JScrollPane(listaMenu);
        scroll.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
        add(scroll, BorderLayout.CENTER);

        JButton botonSeleccionar = new JButton("Seleccionar");
        botonSeleccionar.setFont(new Font("Arial", Font.BOLD, 14));
        botonSeleccionar.addActionListener(e -> ejecutarOpcion());

        JPanel panelBoton = new JPanel();
        panelBoton.add(botonSeleccionar);
        add(panelBoton, BorderLayout.SOUTH);

        listaMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    ejecutarOpcion();
                }
            }
        });
    }

    private void ejecutarOpcion() {
        String opcion = listaMenu.getSelectedValue();

        if (opcion == null) {
            return;
        }

        switch (opcion) {
            case "Registrar Guía Turístico":
                registrarGuia();
                break;

            case "Registrar Vehículo":
                registrarVehiculo();
                break;

            case "Mostrar Registros":
                mostrarRegistros();
                break;

            case "Salir":
                JOptionPane.showMessageDialog(this, "Gracias por utilizar LlanquihueTourApp.");
                System.exit(0);
                break;
        }
    }

    private void registrarGuia() {
        String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del guía:");
        String rut = JOptionPane.showInputDialog(this, "Ingrese el RUT del guía:");
        String especialidad = JOptionPane.showInputDialog(this, "Ingrese la especialidad:");

        if (nombre != null && rut != null && especialidad != null) {
            GuiaTuristico guia = new GuiaTuristico(nombre, rut, especialidad);
            gestor.agregarEntidad(guia);

            JOptionPane.showMessageDialog(this, "Guía turístico registrado correctamente.");
        }
    }

    private void registrarVehiculo() {
        try {
            String patente = JOptionPane.showInputDialog(this, "Ingrese la patente:");
            String tipoVehiculo = JOptionPane.showInputDialog(this, "Ingrese el tipo de vehículo:");
            String capacidadTexto = JOptionPane.showInputDialog(this, "Ingrese la capacidad de pasajeros:");

            if (patente != null && tipoVehiculo != null && capacidadTexto != null) {
                int capacidad = Integer.parseInt(capacidadTexto);

                Vehiculo vehiculo = new Vehiculo(patente, tipoVehiculo, capacidad);
                gestor.agregarEntidad(vehiculo);

                JOptionPane.showMessageDialog(this, "Vehículo registrado correctamente.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La capacidad debe ser un número válido.");
        }
    }

    private void mostrarRegistros() {
        JOptionPane.showMessageDialog(
                this,
                gestor.mostrarTodasLasEntidades(),
                "Registros",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main ventana = new Main();
            ventana.setVisible(true);
        });
    }
}