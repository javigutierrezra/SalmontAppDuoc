package model;

public class Cliente extends Persona {

    public Cliente(String nombre, Rut rut, Direccion direccion) {
        super(nombre, rut, direccion);
    }

    @Override
    public void registrar() {
        System.out.println("Cliente registrado: " + nombre);
    }

    @Override
    public void mostrarDatos() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", rut=" + rut +
                ", direccion=" + direccion +
                '}';
    }
}