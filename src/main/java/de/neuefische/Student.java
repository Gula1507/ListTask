package de.neuefische;

public class Student {
    private final int ID;
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName, int ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + ID +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getID() {
        return ID;
    }
}
