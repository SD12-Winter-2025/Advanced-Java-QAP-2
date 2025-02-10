public class Person {
    private final String firstName;
    private final String lastName;
    private final Address home;

    public Person(String firstName, String lastName, Address home) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = home;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + ", " + this.home.toString();
    }
}