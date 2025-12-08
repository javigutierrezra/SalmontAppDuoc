package model;

public class PlantaProceso extends UnidadOperativa {

    private String tipoProceso;    // Ej: "Fileteado", "Congelado"
    private int trabajadores;

    public PlantaProceso(String id, String nombre, String region,
                         String tipoProceso, int trabajadores) {
        super(id, nombre, region);
        this.tipoProceso = tipoProceso;
        this.trabajadores = trabajadores;
    }

    public String getTipoProceso() {
        return tipoProceso;
    }

    public int getTrabajadores() {
        return trabajadores;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("===== Planta de Proceso =====");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Región: " + getRegion());
        System.out.println("Tipo de proceso: " + tipoProceso);
        System.out.println("Cantidad de trabajadores: " + trabajadores);
    }
}