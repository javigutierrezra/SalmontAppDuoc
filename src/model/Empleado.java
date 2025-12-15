package model;

public class Empleado extends Entidad {
    private String nombreCompleto;
    private String cargo;
    private String area;

    public Empleado(String id, String nombreCompleto, String cargo, String area) {
        super(id);
        this.nombreCompleto = nombreCompleto;
        this.cargo = cargo;
        this.area = area;
    }

    @Override
    public String mostrarResumen() {
        return "Empleado | ID: " + getId()
                + " | Nombre: " + nombreCompleto
                + " | Cargo: " + cargo
                + " | Area: " + area;
    }

}
