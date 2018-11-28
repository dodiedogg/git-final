public class Skladnik{
    private String nazwa;
    private double ilosc;

    public Skladnik(String nazwa, double ilosc) {
        this.nazwa = nazwa;
        this.ilosc = ilosc;
    }

    public double getIlosc() {
        return ilosc;
    }

    public void setIlosc(double ilosc) {
        this.ilosc = ilosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
