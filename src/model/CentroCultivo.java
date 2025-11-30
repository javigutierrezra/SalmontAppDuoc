package model;

public class CentroCultivo extends UnidadOperativa {
    private double toneladasProduccion;

        public CentroCultivo(String nombre, String comuna, double toneladasproduccion) {
            super(nombre, comuna);
            this.toneladasProduccion = toneladasProduccion;
        }
        @Override
        public String toString() {
            return super.toString() + " | Toneladas de Produccion: " + toneladasProduccion;
        }
    }

