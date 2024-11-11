package edu.fra.uas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.fra.uas.service.GradeService;

@SpringBootApplication
public class GradeApplication implements CommandLineRunner {

    @Autowired
    private GradeService gradeService;

    public static void main(String[] args) {
        SpringApplication.run(GradeApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // Beispielhafte Noten hinzufügen
        gradeService.addGrade(1.7);
        gradeService.addGrade(2.0);
        gradeService.addGrade(3.0);
        gradeService.addGrade(2.0);
        gradeService.addGrade(1.0);
        gradeService.addGrade(1.3);
        gradeService.addGrade(1.7);
        gradeService.addGrade(1.3);

        // Notendurchschnitt berechnen
        double average = gradeService.calculateAverage();
        System.out.println("Notendurchschnitt: " + average);
    }
}