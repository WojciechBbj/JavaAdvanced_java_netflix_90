package recources;

public abstract class Person {

    protected String firstName;
    protected String lastName;

    public abstract void introduce();

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
