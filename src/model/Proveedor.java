package model;

public class Proveedor extends Persona {

    private String empresa;
    private String rubro;
    private String telefono;

    public Proveedor(String nombre, Rut rut, Direccion direccion,
                     String empresa, String rubro, String telefono) {

        super(nombre, rut, direccion);
        this.empresa = empresa;
        this.rubro = rubro;
        this.telefono = telefono;
    }

    @Override
    public void registrar() {
        System.out.println("Proveedor registrado: " + empresa);
    }

    @Override
    public void mostrarDatos() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Empresa: " + empresa +
                " | Rubro: " + rubro +
                " | Tel: " + telefono;
    }
}