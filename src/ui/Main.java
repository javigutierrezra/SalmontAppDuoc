package ui;

import model.*;
import interfaces.Registrable;
import utils.ArchivoUtil;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Rut rut = new Rut("12345678-5");
        Direccion dir = new Direccion("Av. Principal 123");

        // ====== LECTURA DESDE ARCHIVO ======
        ArrayList<String> lineas = ArchivoUtil.leerArchivo("src/data/empleados.txt");

        ArrayList<Registrable> registros = new ArrayList<>();

        for (String linea : lineas) {
            if (!linea.contains(";")) {
                continue; // salta lineas invalidas
            }

            String[] partes = linea.split(";");
            String nombre = partes[0];
            String cargo = partes[1];

            Empleado emp = new Empleado(nombre, rut, dir, cargo);
            registros.add(emp);
        }

        // Cliente de prueba
        Cliente cli = new Cliente("Pedro Pérez", rut, dir);
        registros.add(cli);

        // ====== POLIMORFISMO ======
        for (Registrable r : registros) {
            r.registrar();
            r.mostrarDatos();
        }

        // ====== ORDEN DE COMPRA ======
        OrdenDeCompra orden = new OrdenDeCompra(cli);
        orden.agregarProducto(new Producto("Notebook", 800000));
        orden.agregarProducto(new Producto("Mouse", 15000));

        orden.mostrarOrden();
    }
}