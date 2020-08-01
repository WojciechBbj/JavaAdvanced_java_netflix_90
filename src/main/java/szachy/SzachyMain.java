package szachy;

import recources.FileSystemVideoCatalog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SzachyMain {
    public static void main(String[] args) {
        List<Figura> figury = new ArrayList<>(32);

//        Pion pion1 = new Pion(new Punkt('C', (byte) 2), Kolor.BIAŁE);
//        Pion pion2 = new Pion(new Punkt('D', (byte) 8), Kolor.BIAŁE);
//
//        Hetman hetman1 = new Hetman(new Punkt('D', (byte) 4), Kolor.BIAŁE);
//        Hetman hetman2 = new Hetman(new Punkt('H', (byte) 4), Kolor.CZARNE);
//
//
//        figury.add(pion1);
//        figury.add(pion2);
//        figury.add(hetman1);
//        figury.add(hetman2);
//
//        System.out.println("przesuwanie");

        Pion pion3 = new Pion(new Punkt('C', (byte) 2), Kolor.BIAŁE);
        Scanner scanner = new Scanner(System.in);
        Punkt punktDoPrzesunięcia;
        do {
            String kolumna = scanner.nextLine();
            Byte wiersz = scanner.nextByte();
            punktDoPrzesunięcia = new Punkt(kolumna.charAt(0), wiersz);
        } while (!pion3.czyJuzNaTymPunkcie(punktDoPrzesunięcia));

        try {
            pion3.przesun(punktDoPrzesunięcia);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        for (Figura element : figury) {
            try {
                element.przesun(new Punkt('D', (byte) 8));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }
}