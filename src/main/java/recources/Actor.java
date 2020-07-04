package recources;

import java.lang.invoke.SwitchPoint;

public class Actor extends Person {

    public Actor(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
    }

    @Override
    public void introduce()  {
//        if (gender.equals(Gender.MALE)) { //mozna uzyć instrukcji logicznej Gender.MALE == MALE, ummożliwia to Enum
//            System.out.println("My name is " + firstName + " " + lastName + ". I'm actor.");
//        } else {
//            System.out.println("My name is " + firstName + " " + lastName + ". I'm actress.");
//        }
        switch (this.gender) {
            case MALE:
                System.out.println("My name is " + firstName + " " + lastName + ". I'm actor.");
                break;
            case FEMALE:
                System.out.println("My name is " + firstName + " " + lastName + ". I'm actress.");
                break;
        }


    }
}
