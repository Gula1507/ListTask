package de.neuefische;

import java.util.List;
import java.util.Optional;

public class School {
    List<Student> students;

    public School(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    //
    //Step 5: Add a method to find a student by their ID. The found student should be returned.

    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getID() == id) {
                return student;
            }

        }
        return null;
    }


    public void removeStudent(int id) {
        students.removeIf(student -> student.getID() == id);

//        while (iterator.hasNext()) {
//            Student student = iterator.next();
//
//            if (student.getId() == id) {
//                iterator.remove();
//            }
//        }
    }

    public List<Course> getCourses(int id) {
        Optional<Student> studentToFind = students.stream().filter(student -> student.getID() == id).findFirst();
        return studentToFind.map(Student::getCourses).orElse(null);
    }

}

