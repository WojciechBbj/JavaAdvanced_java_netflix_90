package recources;

public class Actor extends Person {

    public Actor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void introduce()  {
        System.out.println("My name is " + firstName + " " + lastName + ". I'm actor.");
    }
}
