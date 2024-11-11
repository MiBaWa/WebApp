package edu.fra.uas.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class GradeService {

    private List<Double> grades = new ArrayList<>();
    
    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double calculateAverage() {
        return grades.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    public List<Double> getGrades() {
        return grades;
    }


}
