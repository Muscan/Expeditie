package model;
import java.time.LocalDate;

public class VremeZi {

    private LocalDate data;
    private double temperatura;

    public VremeZi(LocalDate data, double temperatura) {
        this.data = data;
        this.temperatura = temperatura;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
