package model;

public abstract class UnidadOperativa {
    private String id;
    private String nombre;
    private String region;

    public UnidadOperativa(String id, String nombre, String region) {
        this.id = id;
        this.nombre = nombre;
        this.region = region;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRegion() {
        return region;
    }

    // Metodo polimorfico
    public abstract void mostrarInformacion();
}
