package model;
import enums.VarfMunteEnum;

import java.util.ArrayList;
import java.util.List;

public class VarfMunte extends Entity{

    private VarfMunteEnum nume;
    private int inaltime;
    private List<VremeZi> vremeZile;

    public VarfMunte(VarfMunteEnum nume, int inaltime) {
        this.nume = nume;
        this.inaltime = inaltime;
        this.vremeZile = new ArrayList<>();
    }

    public VarfMunte(VarfMunteEnum nume, int inaltime, List<VremeZi> vremeZile) {
        this.nume = nume;
        this.inaltime = inaltime;
        this.vremeZile = vremeZile;
    }

    public void addVremeZi(VremeZi vremeZi)
    {
        this.vremeZile.add(vremeZi);
    }
    // o metoda ce adauga o VremeZi in lista de vremezile

    public VarfMunteEnum getNume() {
        return nume;
    }

    public int getInaltime() {
        return inaltime;
    }

    public List<VremeZi> getVremeZile() {
        return vremeZile;
    }
    public void setNume(VarfMunteEnum nume) {
        this.nume = nume;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public void setVremeZile(List<VremeZi> vremeZile) {
        this.vremeZile = vremeZile;
    }

    @Override
    public String toString() {
        return "VarfMunte{" +
                "nume=" + nume +
                ", inaltime=" + inaltime +
                ", vremeZile=" + vremeZile +
                '}';
    }

}
