package model;
import java.util.List;

public class Alpinist {
    private List<Produs> produse;
    private List<Articol> articol;

    public Alpinist(List<Produs> produse, List<Articol> articol) {
        this.produse = produse;
        this.articol = articol;
    }
    public List<Produs> getProduse() {
        return produse;
    }
    public List<Articol> getArticol() {
        return articol;
    }

    public void setProduse(List<Produs> produse) {
        this.produse = produse;
    }
    public void setArticol(List<Articol> articol) {
        this.articol = articol;
    }






}
