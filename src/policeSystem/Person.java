package policeSystem;

import java.util.UUID;

public abstract class Person {

    private final UUID id;
    private final String name;
    private final String firstName;
    private final int age;
    private final Sex sex;

    public Person(String name, String firstName, int age, Sex sex) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.firstName = firstName;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Person)) {
            return false;
        }
        Person otherPerson = (Person) other;
        return this.id.equals(otherPerson.id);
    }

    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Vorname: %s, Alter: %s, Sex: %S",
                this.id, this.name, this.firstName, this.age, this.sex);
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }
}
