package edu.fra.uas.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GradeService {

    private List<Double> grades;

    public GradeService() {
        grades = new ArrayList<>();
        System.out.println("Noten initialisiert: " + grades);
    }

    public void clearData() {
        grades.clear();
        System.out.println("Notenliste geleert");
    }

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
