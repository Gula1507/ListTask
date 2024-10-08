package de.neuefische;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Peter", "Schmidt", 18));
        students.add(new Student("Arnold", "Schiller", 20));

        School school = new School(students);

        school.addStudent(new Student("Anna", "Müller", 19));
        school.printStudents();

        System.out.println("Found student with id 19: " + school.findStudentById(19));

        school.removeStudent(19);
        school.printStudents();
    }
}