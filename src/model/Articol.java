package model;

public class Articol {

    private String nume;

    public Articol(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Articol{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
