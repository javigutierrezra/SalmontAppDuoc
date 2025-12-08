package ui;

import data.GestorUnidades;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Sistema Salmontt - Unidades Operativas ===");

        GestorUnidades gestor = new GestorUnidades();
        gestor.mostrarUnidades();
    }
}
