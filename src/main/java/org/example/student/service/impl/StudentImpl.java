package org.example.student.service.impl;

import org.example.student.model.Student;
import org.example.student.service.StudentInterface;

import java.util.Iterator;
import java.util.List;

public class StudentImpl implements StudentInterface {

    public void removeLowPerformingStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3.0) {
                iterator.remove();
            } else {
                student.promoteToNextCourse();
            }
        }
    }

    @Override
    public void printStudents(List<Student> studentList, int course) {
        System.out.println("\nStudents on the course " + course + ":");
        for(Student student: studentList){
            if(student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

}
