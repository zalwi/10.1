package data;

import logic.IncorrectAgeException;
import logic.NameUndefinedException;

public class Person {
    private String firstName, lastName, pesel;
    private int age;

    public Person(String firstName, String lastName, int age, String pesel){

        if(     firstName == null || lastName == null ||
                firstName.length() <3 || lastName.length() <3) {
                    throw new NameUndefinedException(   "Błąd imienia lub nazwiska, nie można utworzyć: firstname=" +
                                                        firstName + " lastname=" + lastName);
        }

        if(age < 1) throw new IncorrectAgeException("Błąd, osoba ma zerowy lub ujemny wiek: age=" + age);

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", age=" + age +
                '}';
    }
}
