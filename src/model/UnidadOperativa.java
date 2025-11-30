package model;

public class UnidadOperativa {
    private String nombre;
    private String comuna;

    public UnidadOperativa(String nombre, String comuna) {
        this.nombre = nombre;
        this.comuna = comuna;
    }
    public String getNombre() {
        return nombre;
    }
    public String getComuna() {
        return comuna;
    }
    @Override
    public String toString() {
        return "Unidad Operativa: " + nombre + " | Comuna: " + comuna;
    }
}
