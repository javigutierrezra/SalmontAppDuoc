package data;

import model.CentroCultivo;
import model.PlantaProceso;

public class GestorUnidades {
    public void crearUnidades() {

        CentroCultivo c1 = new CentroCultivo("Centro Hornopiren" , "Hualaihue", 1200.5);
        CentroCultivo c2 = new CentroCultivo("Centro Pichicolo", "Calbuco", 900.2);

        PlantaProceso p1 = new PlantaProceso("Planta Puerta Sur", "Puerto Montt", 500);
        PlantaProceso p2 = new PlantaProceso("Planta Maillen", "Maillen", 700);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(p1);
        System.out.println(p2);

    }
}
