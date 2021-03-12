package model;

public class Ambalate extends Produs {

    public Ambalate(String nume, int cantitate) {
        super(nume, cantitate);
    }
    //apel la constructorul la super clasa
    @Override
    public String toString() {
        return "Conserva (Nume: " + this.getNume() + ", Cantitate: " + this.getCantitate() + " bucati)";
    }
}
