package ui;

import data.GestorUnidades;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Unidades Operativas Salmontt ===");

        GestorUnidades gestor = new GestorUnidades();
        gestor.crearUnidades();
    }
}
