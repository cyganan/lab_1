package com.company;

import java.util.Comparator;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String first_name, String last_name) throws PersonException {
        this.setFirstName(first_name);
        this.setLastName(last_name);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String first_name) throws PersonException {
        if (first_name != null && !first_name.equals("")) {
            this.firstName = first_name;
        } else {
            throw new PersonException("Pole <Imię> musi być wypełnione.");
        }
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String last_name) throws PersonException {
        if (last_name != null && !last_name.equals("")) {
            this.lastName = last_name;
        } else {
            throw new PersonException("Pole <Nazwisko> musi być wypełnione.");
        }
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public void setBirthYear(int birth_year) throws PersonException {
        if (birth_year == 0 || birth_year >= 1900 && birth_year <= 2030) {
            this.birthYear = birth_year;
        } else {
            throw new PersonException("Rok urodzenia musi być w przedziale [1900 - 2030].");
        }
    }

    public void setBirthYear(String birth_year) throws PersonException {
        if (birth_year != null && !birth_year.equals("")) {
            try {
                this.setBirthYear(Integer.parseInt(birth_year));
            } catch (NumberFormatException var3) {
                throw new PersonException("Rok urodzenia musi być liczbą całkowitą.");
            }
        } else {
            this.setBirthYear(0);
        }
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Person)) {
            return false;
        } else {
            Person person = (Person) o;
            return this.getBirthYear() == person.getBirthYear() && this.getFirstName().equals(person.getFirstName()) && this.getLastName().equals(person.getLastName());
        }
    }

    public int hashCode() {
        return Objects.hash(this.getFirstName(), this.getLastName(), this.getBirthYear());
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    static class NameCompare implements Comparator<Person> {
        NameCompare() {
        }

        public int compare(Person p1, Person p2) {
            return p1.getFirstName().compareTo(p2.getFirstName());
        }
    }
}
