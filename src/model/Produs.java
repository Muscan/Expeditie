package model;
public class Produs extends Entity<Long> {

    private String nume;
    private int cantitate;

    Produs(Long id, String nume, int cantitate) {
        super(id);
        this.nume = nume;
        this.cantitate = cantitate;
    }

    public Produs() {
        super();
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
