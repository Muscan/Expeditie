package model;

public class Produs {

    private String nume;
    private int cantitate;
    //Constructorul va avea acelasi nume ca si clasa

    Produs(String nume, int cantitate) {
    this.nume = nume;
    this.cantitate = cantitate;
    }
    //getter+seetter da acces(din main, alte clase) la variabilele nume si cantitate.
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
