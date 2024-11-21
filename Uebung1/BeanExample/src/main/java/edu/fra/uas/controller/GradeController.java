package edu.fra.uas.controller;

import edu.fra.uas.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GradeController {

    @Autowired
    private GradeService gradeService;

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
}