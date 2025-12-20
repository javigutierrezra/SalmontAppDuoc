package model;

import java.util.ArrayList;

public class OrdenDeCompra {
    private Cliente cliente;
    private ArrayList<Producto> productos;

    public OrdenDeCompra(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void mostrarOrden() {
        System.out.println("Orden de " + cliente.getNombre());
        productos.forEach(System.out::println);
    }
}