package data;

import model.*;

import java.util.ArrayList;

public class GestorEntidades {

    private final ArrayList<Registrable> entidades = new ArrayList<>();

    public void agregar(Registrable r) {
        entidades.add(r);
    }

    public String reporte() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== REPORTE SALMONTT ===\n\n");

        int proveedores = 0, empleados = 0, otros = 0;

        for (Registrable r : entidades) {
            sb.append("- ").append(r.mostrarResumen()).append("\n");

            if (r instanceof Proveedor) {
                proveedores++;
            } else if (r instanceof Empleado) {
                empleados++;
            } else {
                otros++;
            }
        }

        sb.append("\n--- Conteo (instanceof) ---\n");
        sb.append("Proveedores: ").append(proveedores).append("\n");
        sb.append("Empleados: ").append(empleados).append("\n");
        sb.append("Otros: ").append(otros).append("\n");

        return sb.toString();
    }
}
