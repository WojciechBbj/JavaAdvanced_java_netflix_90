package pl.yellowduck.netflix90;

import recources.Actor;
import recources.Director;
import recources.Person;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

  public static void main(String[] args) {

    Director tommy = new Director("Tommy", "Wiseau");

    Actor tommyActor = new Actor("Tommy", "Wiseau");
    Actor juliette = new Actor("Juliette", "Danielle");
    Actor greg = new Actor("Greg", "Sestero");

    Set<Person> persons = new HashSet<>();
    persons.add(tommy);
    persons.add(tommyActor);
    persons.add(juliette);
    persons.add(greg);

    for(Person person : persons) {
      person.introduce();
    }

    for (int i = 0; i < persons.size(); i++) {
      
    }
  }


}
