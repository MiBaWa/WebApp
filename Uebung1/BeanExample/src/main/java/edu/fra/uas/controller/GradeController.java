package edu.fra.uas.controller;

import org.springframework.beans.factory.annotation.Autowired;


import edu.fra.uas.service.GradeService;

public class GradeController {

    private final GradeService gradeService;

    @Autowired
    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @PostMapping("/add")
    public String addGrade(@RequestParam double grade) {
        gradeService.addGrade(grade);
        return "Grade added";
    }




}
