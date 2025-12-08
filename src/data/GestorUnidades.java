package data;

import model.CentroCultivo;
import model.PlantaProceso;
import model.UnidadOperativa;

import java.util.ArrayList;
import java.util.List;

public class GestorUnidades {

    private List<UnidadOperativa> unidades;

    public GestorUnidades() {
        unidades = new ArrayList<>();
        cargarUnidadesEjemplo();
    }

    // Paso 2: cargar al menos 5 objetos combinando subclases
    private void cargarUnidadesEjemplo() {
        unidades.add(new CentroCultivo(
                "CC-001", "Centro Chiloé Norte", "Los Lagos",
                "Salmón Atlántico", 50000
        ));

        unidades.add(new CentroCultivo(
                "CC-002", "Centro Aysén Sur", "Aysén",
                "Trucha Arcoíris", 30000
        ));

        unidades.add(new PlantaProceso(
                "PP-001", "Planta Puerto Montt", "Los Lagos",
                "Fileteado y envasado", 200
        ));

        unidades.add(new PlantaProceso(
                "PP-002", "Planta Quellón", "Los Lagos",
                "Congelado", 150
        ));

        unidades.add(new CentroCultivo(
                "CC-003", "Centro Magallanes", "Magallanes",
                "Salmón Coho", 40000
        ));
    }

    public List<UnidadOperativa> getUnidades() {
        return unidades;
    }

    // Paso 3: recorrer y mostrar polimórficamente
    public void mostrarUnidades() {
        for (UnidadOperativa uo : unidades) {
            uo.mostrarInformacion();   // <-- POLIMORFISMO AQUÍ
            System.out.println();      // línea en blanco
        }
    }
}
