package model;

public class Produs {

    private String nume;
    private int cantitate;

    Produs(String nume, int cantitate) {
    this.nume = nume;
    this.cantitate = cantitate;
    }
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }
}
