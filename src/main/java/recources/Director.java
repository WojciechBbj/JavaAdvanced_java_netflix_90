package recources;

import java.time.Period;

public class Director extends Person {

    public Director(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
    }

    @Override
    public void introduce()  {
        System.out.println("My name is " + firstName + " " + lastName + ". I'm director.");
    }

}
