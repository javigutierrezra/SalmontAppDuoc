package model;

public class CentroCultivo extends UnidadOperativa {

    private String especiePrincipal;
    private int capacidadMaximaToneladas;

    public CentroCultivo(String id, String nombre, String region,
                         String especiePrincipal, int capacidadMaximaToneladas) {
        super(id, nombre, region);
        this.especiePrincipal = especiePrincipal;
        this.capacidadMaximaToneladas = capacidadMaximaToneladas;
    }

    public String getEspeciePrincipal() {
        return especiePrincipal;
    }

    public int getCapacidadMaximaToneladas() {
        return capacidadMaximaToneladas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("===== Centro de Cultivo =====");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Región: " + getRegion());
        System.out.println("Especie principal: " + especiePrincipal);
        System.out.println("Capacidad máxima (ton): " + capacidadMaximaToneladas);
    }
}
