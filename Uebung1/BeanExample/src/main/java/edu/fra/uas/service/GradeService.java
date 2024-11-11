package edu.fra.uas.service;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import java.util.ArrayList;
import java.util.List;

@Service
public class GradeService {

    private List<Double> grades = new ArrayList<>();
    
    @PostConstruct
    public void initData() {
        addGrade(1.7);
        addGrade(2.0);
        addGrade(3.0);
        addGrade(2.0);
        addGrade(1.0);
        addGrade(1.3);
        addGrade(1.7);
        addGrade(1.3);
        System.out.println("Noten initialsiieren: " + grades);
    }

    @PreDestroy
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
