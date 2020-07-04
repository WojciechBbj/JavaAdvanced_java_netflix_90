package recources;

public enum Category implements Discountable {
    //klase Enum, nie może dziedziczyć, nie można po nim dziedziczyć
    //stosujemy gdy mamy skończony zbiór wartości
    //nie może przyjąć innej wartości niż podane w klasie
    //pozwala miec atrybuty, które dodaja enum funkcjonalnosci
    //dane wprowadzane do enum maja swój nr zaczynające się od 0, nr pozycji enum zwraca metoda "ordinal"
    //enum może być rozszerzony o własne atrynuty (discout, descriptio) oraz moze imlementować interfejsy
    COMEDY (0, "Funny film") {
        @Override
        public String toString(){
            return "Hahahaha ....";
        }

    },
    DRAMA (5, "Go issue?"),
    THRILLER (3, "Funny film"),
    HORROR (4, "Funny film"),
    DOCUMENTARY (5, "About thing had happend"),
    MUSICAL (4, "Funny film"),
    ACTION (3, "A lot of gunshot"),
    FANTASY (2, "Magical world");

    private final int discount;
    private final String description;

    Category (int discount, String description) {
        this.discount = discount;
        this.description = description;
    }

    @Override
    public int discount() {
        return discount;
    }
}