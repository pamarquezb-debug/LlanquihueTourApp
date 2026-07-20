package ui;

import data.GestorEntidades;
import model.Direccion;
import model.GuiaTuristico;
import model.Rut;
import model.Vehiculo;
import util.RutInvalidoException;

import javax.swing.*;
import java.awt.*;

/**
 * Clase principal de LlanquihueTourApp.
 *
 * Permite registrar guías turísticos y vehículos,
 * además de mostrar las entidades registradas.
 *
 * @author Pablo Márquez Barría
 * @version 1.0
 */
public class Main extends JFrame {

    private final GestorEntidades gestor;
    private final JList<String> listaMenu;

    public Main() {
        gestor = new GestorEntidades();

        setTitle("LlanquihueTourApp");
        setSize(500, 380);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel titulo = new JLabel(
                "LlanquihueTourApp",
                SwingConstants.CENTER
        );

        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        titulo.setBorder(
                BorderFactory.createEmptyBorder(15, 10, 15, 10)
        );

        add(titulo, BorderLayout.NORTH);

        String[] opciones = {
                "Registrar Guía Turístico",
                "Registrar Vehículo",
                "Mostrar Registros",
                "Salir"
        };

        listaMenu = new JList<>(opciones);
        listaMenu.setFont(new Font("Arial", Font.PLAIN, 16));
        listaMenu.setSelectionMode(
                ListSelectionModel.SINGLE_SELECTION
        );
        listaMenu.setSelectedIndex(0);
        listaMenu.setFixedCellHeight(45);

        JScrollPane scroll = new JScrollPane(listaMenu);
        scroll.setBorder(
                BorderFactory.createEmptyBorder(10, 30, 10, 30)
        );

        add(scroll, BorderLayout.CENTER);

        JButton botonSeleccionar = new JButton("Seleccionar");
        botonSeleccionar.setFont(
                new Font("Arial", Font.BOLD, 14)
        );

        botonSeleccionar.addActionListener(
                e -> ejecutarOpcion()
        );

        JPanel panelBoton = new JPanel();
        panelBoton.add(botonSeleccionar);

        add(panelBoton, BorderLayout.SOUTH);

        listaMenu.addMouseListener(
                new java.awt.event.MouseAdapter() {

                    @Override
                    public void mouseClicked(
                            java.awt.event.MouseEvent evento
                    ) {
                        if (evento.getClickCount() == 2) {
                            ejecutarOpcion();
                        }
                    }
                }
        );
    }

    /**
     * Ejecuta la opción seleccionada en el menú.
     */
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
                JOptionPane.showMessageDialog(
                        this,
                        "Gracias por utilizar LlanquihueTourApp."
                );

                System.exit(0);
                break;

            default:
                JOptionPane.showMessageDialog(
                        this,
                        "Seleccione una opción válida.",
                        "Aviso",
                        JOptionPane.WARNING_MESSAGE
                );
        }
    }

    /**
     * Solicita los datos necesarios para registrar un guía turístico.
     */
    private void registrarGuia() {
        String nombre = solicitarTexto(
                "Ingrese el nombre del guía:"
        );

        if (nombre == null) {
            return;
        }

        String rutTexto = solicitarTexto(
                "Ingrese el RUT del guía:"
        );

        if (rutTexto == null) {
            return;
        }

        String calle = solicitarTexto(
                "Ingrese la calle:"
        );

        if (calle == null) {
            return;
        }

        String ciudad = solicitarTexto(
                "Ingrese la ciudad:"
        );

        if (ciudad == null) {
            return;
        }

        String region = solicitarTexto(
                "Ingrese la región:"
        );

        if (region == null) {
            return;
        }

        String especialidad = solicitarTexto(
                "Ingrese la especialidad del guía:"
        );

        if (especialidad == null) {
            return;
        }

        try {
            Rut rut = new Rut(rutTexto);

            Direccion direccion = new Direccion(
                    calle,
                    ciudad,
                    region
            );

            GuiaTuristico guia = new GuiaTuristico(
                    nombre,
                    rut,
                    direccion,
                    especialidad
            );

            gestor.agregarEntidad(guia);

            JOptionPane.showMessageDialog(
                    this,
                    "Guía turístico registrado correctamente.",
                    "Registro exitoso",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } catch (RutInvalidoException e) {
            JOptionPane.showMessageDialog(
                    this,
                    e.getMessage(),
                    "RUT inválido",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    /**
     * Solicita los datos necesarios para registrar un vehículo.
     */
    private void registrarVehiculo() {
        String patente = solicitarTexto(
                "Ingrese la patente:"
        );

        if (patente == null) {
            return;
        }

        String tipoVehiculo = solicitarTexto(
                "Ingrese el tipo de vehículo:"
        );

        if (tipoVehiculo == null) {
            return;
        }

        String capacidadTexto = solicitarTexto(
                "Ingrese la capacidad de pasajeros:"
        );

        if (capacidadTexto == null) {
            return;
        }

        try {
            int capacidad = Integer.parseInt(
                    capacidadTexto
            );

            if (capacidad <= 0) {
                JOptionPane.showMessageDialog(
                        this,
                        "La capacidad debe ser mayor que cero.",
                        "Dato inválido",
                        JOptionPane.ERROR_MESSAGE
                );

                return;
            }

            Vehiculo vehiculo = new Vehiculo(
                    patente,
                    tipoVehiculo,
                    capacidad
            );

            gestor.agregarEntidad(vehiculo);

            JOptionPane.showMessageDialog(
                    this,
                    "Vehículo registrado correctamente.",
                    "Registro exitoso",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "La capacidad debe ser un número entero válido.",
                    "Dato inválido",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    /**
     * Muestra todas las entidades registradas.
     */
    private void mostrarRegistros() {
        String registros = gestor.mostrarTodasLasEntidades();

        if (registros == null || registros.isBlank()) {
            JOptionPane.showMessageDialog(
                    this,
                    "No hay entidades registradas.",
                    "Registros",
                    JOptionPane.INFORMATION_MESSAGE
            );

            return;
        }

        JTextArea areaTexto = new JTextArea(registros);
        areaTexto.setEditable(false);
        areaTexto.setFont(
                new Font("Monospaced", Font.PLAIN, 13)
        );
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);

        JScrollPane scrollRegistros = new JScrollPane(areaTexto);
        scrollRegistros.setPreferredSize(
                new Dimension(430, 250)
        );

        JOptionPane.showMessageDialog(
                this,
                scrollRegistros,
                "Registros",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    /**
     * Solicita un texto y evita aceptar campos vacíos.
     *
     * @param mensaje mensaje que se muestra al usuario.
     * @return texto ingresado o null si se cancela.
     */
    private String solicitarTexto(String mensaje) {
        while (true) {
            String texto = JOptionPane.showInputDialog(
                    this,
                    mensaje
            );

            if (texto == null) {
                return null;
            }

            texto = texto.trim();

            if (!texto.isEmpty()) {
                return texto;
            }

            JOptionPane.showMessageDialog(
                    this,
                    "El campo no puede quedar vacío.",
                    "Dato obligatorio",
                    JOptionPane.WARNING_MESSAGE
            );
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main ventana = new Main();
            ventana.setVisible(true);
        });
    }
}