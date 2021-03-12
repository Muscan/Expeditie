package model;

public class Apa extends Produs{
    public Apa(String nume, int cantitate) {
        super(nume, cantitate);
    }

    @Override
    public String toString() {
        return "Apa(Nume: " + this.getNume() + ", Cantitate: " + this.getCantitate() + " doze)";
    }
}
