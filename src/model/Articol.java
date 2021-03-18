package model;
public class Articol extends Entity<Long> {

    private String nume;

    public Articol(Long id, String nume) {
        super(id);
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