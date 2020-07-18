package szachy;

public class Pion extends Figura {


    public Pion (Punkt punkt, Kolor kolor) {
        super("Pion", punkt, kolor);
    }

    @Override
    public void przesun(Punkt punkt) throws TenSamPunktException {
        if (this.punktNaSzachownicy.equals(punkt)) {
            throw new TenSamPunktException("To samo pole");
        }
        System.out.println("Przesuń z " + this.punktNaSzachownicy + " na " + punkt);
        this.punktNaSzachownicy = punkt;
    }

    @Override
    public String toString() {
        return "Pion{" +
                "punktNaSzachownicy=" + punktNaSzachownicy +
                '}';
    }
}
