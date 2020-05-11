package logic;

import data.Person;
import logic.IncorrectAgeException;
import logic.NameUndefinedException;

public class PersonCreator {
    Person[] persons;

    public PersonCreator() {
        this.persons = new Person[3];
    }

    public void addPersonToTable(int personId, String firstName, String lastName, int age, String pesel) {
        try {
            persons[personId] = new Person(firstName, lastName, age, pesel);
        } catch (IncorrectAgeException e) {
            e.printStackTrace();
        } catch (NameUndefinedException e) {
            e.printStackTrace();
        }
    }

    public void showSavedPersons() {
        for (Person p : persons) {
            if (p != null) System.out.println(p.toString());
            else System.out.println("Person{null}");
        }
    }
}