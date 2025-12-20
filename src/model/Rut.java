package model;

public class Rut {
    private String numero;

    public Rut(String numero) {
        if (!numero.matches("\\d{7,8}-[\\dkK]")) {
            throw new IllegalArgumentException("RUT inválido");
        }
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero;
    }
}
