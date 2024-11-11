package org.example.student.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
@AllArgsConstructor
public class Student {
    @NonNull
    private String name;
    @NonNull
    private String group;
    private int course;
    @NonNull
    private List<Integer> grades;

    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void promoteToNextCourse() {
        if (course < 5) {
            course++;
        }
    }

}
