package pl.yellowduck.netflix90;

import recources.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static recources.Gender.*;
import static recources.Category.*;

public class Main2 {

    public static void main(String[] args) {

        Director tommy = new Director("Tommy", "Wiseau", MALE);

        Actor tommyActor = new Actor("Tommy", "Wiseau", MALE);
        Actor juliette = new Actor("Juliette", "Danielle", FEMALE);
        Actor greg = new Actor("Greg", "Sestero", MALE);

        Set<Person> persons = new HashSet<>();
        persons.add(tommy);
        persons.add(tommyActor);
        persons.add(juliette);
        persons.add(greg);

        VideoCassette theRoom = new VideoCassette(
                "VID001",
                BigDecimal.valueOf(20),
                "THE ROOM",
                tommy,
                Category.DRAMA,
                Set.of(tommyActor, juliette, greg)
        );

        theRoom.printOut();
    }
}
