package model;
import java.util.List;

public class VarfMunte {

    private String nume;
    private int inaltime;
    private List<VremeZi> vremeZile;

    public VarfMunte(String nume, int inaltime, List<VremeZi> vremeZile) {
        this.nume = nume;
        this.inaltime = inaltime;
        this.vremeZile = vremeZile;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getInaltime() {
        return inaltime;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public List<VremeZi> getVremeZile() {
        return vremeZile;
    }

    public void setVremeZile(List<VremeZi> vremeZile) {
        this.vremeZile = vremeZile;
    }

}
