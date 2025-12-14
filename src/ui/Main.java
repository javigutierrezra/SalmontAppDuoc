package ui;

import data.GestorEntidades;

public class Main {
    public static void main(String[] args) {
        GestorEntidades gestor = new GestorEntidades();
        MenuUI menu = new MenuUI(gestor);
        menu.iniciar();
    }
}