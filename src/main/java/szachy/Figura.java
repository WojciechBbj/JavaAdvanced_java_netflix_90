package szachy;

public abstract class Figura implements Porusza {

    private final String nazwa; //nie musi być protected bo atrybut nie bedzie zmieniany
    protected Punkt punktNaSzachownicy;
    private final Kolor kolor;  //nie musi być protected bo atrybut nie bedzie zmieniany

    protected Figura(String nazwa, Punkt punktNaSzachownicy, Kolor kolor) {
        this.nazwa = nazwa;
        this.punktNaSzachownicy = punktNaSzachownicy;
        this.kolor = kolor;
    }

    public boolean czyJuzNaTymPunkcie(Punkt punktDoPrzesunięcia) {
        return this.punktNaSzachownicy.equals(punktDoPrzesunięcia);
    }

    @Override
    public void zbij(Punkt punkt) throws TenSamPunktException {
        przesun(punkt);
        System.out.println("Zbij piona na " + punkt);
        this.punktNaSzachownicy = punkt;

    }

    @Override
    public String toString() {
        return  "nazwa='" + nazwa + '\'' +
                ", punktNaSzachownicy=" + punktNaSzachownicy +
                ", kolor=" + kolor;
    }
}

