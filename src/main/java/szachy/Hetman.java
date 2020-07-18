package szachy;

public class Hetman extends Figura {


    public Hetman(Punkt punkt, Kolor kolor) {
        super("Hetman", punkt, kolor);
    }

    @Override
    public void przesun(Punkt punkt) {
        this.punktNaSzachownicy = punkt;
        System.out.println("Przesuń hetmana z " + this.punktNaSzachownicy + " na " + punkt);
        this.punktNaSzachownicy = punkt;
    }

    @Override
    public void zbij(Punkt punkt) throws TenSamPunktException {
        super.zbij(punkt);
        System.out.println("Jestem Hetmanem");
    }
}
