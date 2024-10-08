package de.neuefische;

public class Course {
    String name;
    String instructor;
    int room;

    public Course(String name, String instructor, int room) {
        this.name = name;
        this.instructor = instructor;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", instructor='" + instructor + '\'' +
                ", room=" + room +
                '}';
    }
}
