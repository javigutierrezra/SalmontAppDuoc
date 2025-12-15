package model;

public abstract class Entidad implements Registrable {
    private String id;

    public Entidad(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
}
