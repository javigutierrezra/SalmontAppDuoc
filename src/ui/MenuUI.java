package ui;

import data.GestorEntidades;
import model.Empleado;
import model.Proveedor;

import javax.swing.*;

public class MenuUI {

    private final GestorEntidades gestor;

    public MenuUI(GestorEntidades gestor) {
        this.gestor = gestor;
    }

    public void iniciar() {
        boolean seguir = true;

        while (seguir) {
            String opcion = JOptionPane.showInputDialog(
                    null,
                    "SalmonttApp\n\n" +
                            "1) Registrar Proveedor\n" +
                            "2) Registrar Empleado\n" +
                            "3) Ver Reporte\n" +
                            "4) Salir\n\n" +
                            "Opción (1-4):"
            );

            if (opcion == null) return;

            switch (opcion.trim()) {
                case "1":
                    registrarProveedor();
                    break;
                case "2":
                    registrarEmpleado();
                    break;
                case "3":
                    mostrarReporte();
                    break;
                case "4":
                    seguir = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        }
    }

    private void registrarProveedor() {
        String id = pedir("ID Proveedor (ej: PROV-001)");
        if (id == null) return;

        String empresa = pedir("Nombre empresa");
        if (empresa == null) return;

        String rubro = pedir("Rubro");
        if (rubro == null) return;

        String telefono = pedir("Teléfono");
        if (telefono == null) return;

        gestor.agregar(new Proveedor(id, empresa, rubro, telefono));
        JOptionPane.showMessageDialog(null, "Proveedor registrado ✅");
    }

    private void registrarEmpleado() {
        String id = pedir("ID Empleado (ej: EMP-001)");
        if (id == null) return;

        String nombre = pedir("Nombre completo");
        if (nombre == null) return;

        String cargo = pedir("Cargo");
        if (cargo == null) return;

        String area = pedir("Área");
        if (area == null) return;

        gestor.agregar(new Empleado(id, nombre, cargo, area));
        JOptionPane.showMessageDialog(null, "Empleado registrado ✅");
    }

    private void mostrarReporte() {
        String reporte = gestor.reporte();

        JTextArea area = new JTextArea(reporte, 18, 55);
        area.setEditable(false);

        JOptionPane.showMessageDialog(
                null,
                new JScrollPane(area),
                "Reporte Salmontt",
                JOptionPane.INFORMATION_MESSAGE
        );

        // También mostrar por consola (para el video)
        System.out.println(reporte);
    }

    private String pedir(String mensaje) {
        while (true) {
            String input = JOptionPane.showInputDialog(null, mensaje);
            if (input == null) return null;
            input = input.trim();
            if (!input.isEmpty()) return input;
            JOptionPane.showMessageDialog(null, "Este campo no puede estar vacío.");
        }
    }
}