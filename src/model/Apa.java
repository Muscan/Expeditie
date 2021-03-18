package model;

public class Apa extends Produs {
    public Apa(Long id, String nume, int cantitate) {
        super(id, nume, cantitate);
    }

    @Override
    public String toString() {
        return "Apa(Nume: " + this.getNume() + ", Cantitate: " + this.getCantitate() + " doze)";
    }
}
