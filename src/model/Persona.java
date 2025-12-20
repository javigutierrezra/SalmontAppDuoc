package model;

import interfaces.Registrable;

public abstract class Persona implements Registrable {
    protected String nombre;
    protected Rut rut;
    protected Direccion direccion;

    public Persona(String nombre, Rut rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }

    // Getter propio (NO override)
    public String getNombre() {
        return nombre;
    }
}