package recources;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Period;

public class Director extends Person {

    @JsonCreator
    public Director(@JsonProperty("firstName")String firstName,
                    @JsonProperty("lastName")String lastName,
                    @JsonProperty("gender")Gender gender) {
        super(firstName, lastName, gender);
    }

    @Override
    public void introduce()  {
        System.out.println("My name is " + firstName + " " + lastName + ". I'm director.");
    }

}
