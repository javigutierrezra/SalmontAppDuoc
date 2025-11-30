package model;

public class PlantaProceso extends UnidadOperativa {
    private int capacidadProceso;
    public PlantaProceso(String nombre, String comuna, int capacidadProceso) {
        super(nombre, comuna);
        this.capacidadProceso = capacidadProceso;
    }
    @Override
    public String toString() {
        return super.toString() +
                " | Capacidad de Proceso: " + capacidadProceso + " toneladas/dia ";
    }
}
