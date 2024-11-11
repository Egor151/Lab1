package org.example.student.service;

import org.example.student.model.Student;

import java.util.List;

public interface StudentInterface {
    void removeLowPerformingStudents(List<Student> students);

    void printStudents(List<Student> studentList, int course);
}
