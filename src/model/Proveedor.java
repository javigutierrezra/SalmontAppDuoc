package model;

public class Proveedor  extends Entidad {
    private String nombreEmpresa;
    private String rubro;
    private String telefono;

    public Proveedor(String id, String nombreEmpresa, String rubro, String telefono) {
        super(id);
        this.nombreEmpresa = nombreEmpresa;
        this.rubro = rubro;
        this.telefono = telefono;
    }
    @Override
    public String mostrarResumen() {
        return "Proveedor | ID: " + getId()
                + " | Empresa: " + nombreEmpresa
                + " | Rubro: " + rubro
                + " | Telefono: " + telefono;
    }
}
