package model;

public class Ambalate extends Produs {

    public Ambalate(Long id, String nume, int cantitate) {
        super(id, nume, cantitate);
    }


    @Override
    public String toString() {
        return "Ambalate(Nume: " + this.getNume() + ", Cantitate: " + this.getCantitate() + " bucati)";
    }
}
