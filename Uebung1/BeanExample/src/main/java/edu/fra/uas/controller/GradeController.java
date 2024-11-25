package edu.fra.uas.controller;

import edu.fra.uas.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class GradeController {

    @Autowired
    private GradeService gradeService;

    // Web-Frontend Endpunkte
    @GetMapping("/")
    public String viewGrades(Model model) {
        model.addAttribute("grades", gradeService.getGrades());
        double average = gradeService.calculateAverage();
        model.addAttribute("average", String.format("%.2f", average));
        return "grades";
    }

    @PostMapping("/addGrade")
    public String addGrade(@RequestParam("grade") double grade) {
        gradeService.addGrade(grade);
        return "redirect:/";
    }

    @PostMapping("/clearGrades")
    public String clearGrades() {
        gradeService.clearData();
        return "redirect:/";
    }

    // REST API Endpunkte
    @RestController
    @RequestMapping("/api/grades")
    public static class GradeRestController {

        @Autowired
        private GradeService gradeService;

        @GetMapping
        public List<Double> getGrades() {
            return gradeService.getGrades();
        }

        @GetMapping("/average")
        public double getAverage() {
            return gradeService.calculateAverage();
        }

        @PostMapping
        public void addGrade(@RequestBody double grade) {
            gradeService.addGrade(grade);
        }

        @DeleteMapping
        public void clearGrades() {
            gradeService.clearData();
        }
    }
}