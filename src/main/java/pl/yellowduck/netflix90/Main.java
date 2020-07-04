package pl.yellowduck.netflix90;

import recources.Actor;
import recources.Director;
import recources.Person;

import java.util.HashSet;
import java.util.Set;

import static recources.Gender.*;

public class Main {

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

    for(Person person : persons) {
      person.introduce();
    }
  }


}
