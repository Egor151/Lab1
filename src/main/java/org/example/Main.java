package org.example;


import org.example.student.model.Student;
import org.example.student.service.StudentInterface;
import org.example.student.service.impl.StudentImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Анна Иванова", "Группа 101", 1, List.of(4, 5, 4, 3)));
        students.add(new Student("Иван Петров", "Группа 102", 1, List.of(2, 2, 3, 2)));
        students.add(new Student("Мария Сидорова", "Группа 103", 2, List.of(3, 3, 4, 3)));
        students.add(new Student("Петр Николаев", "Группа 101", 3, List.of(5, 4, 5, 5)));

        StudentInterface studentInterface = new StudentImpl();

        System.out.println("The original list of students: ");
        students.forEach(System.out::println);

        studentInterface.removeLowPerformingStudents(students);

        System.out.println("\nThe list of students after processing:");
        students.forEach(System.out::println);

        studentInterface.printStudents(students, 2);
    }
}