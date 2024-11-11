package edu.fra.uas.service;

import java.util.ArrayList;
import java.util.List;

import edu.fra.uas.Student;
import edu.fra.uas.Fach;
import edu.fra.uas.Note;

public class NotenService {
    private List<Student> students = new ArrayList<>();

    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    public Student addFachToStudent(Long studentId, Fach fach) {
        Student student = findStudentById(studentId);
        if (student != null) {
            student.addFach(fach);
        }
        return student;
    }

    public Student addNoteToFach(Long studentId, String fachName, Note note) {
        Student student = findStudentById(studentId);
        if (student != null) {
            Fach fach = student.getFachList().stream()
                    .filter(f -> f.getName().equalsIgnoreCase(fachName))
                    .findFirst()
                    .orElse(null);
            if (fach != null) {
                fach.addNote(note);
            }
        }
        return student;
    }

    public double calculateDurchschnitt(Long studentId) {
        Student student = findStudentById(studentId);
        return student != null ? student.getDurchschnitt() : 0.0;
    }

    public List<Student> getAllStudents() {
        return students;
    }

    private Student findStudentById(Long id) {
        return students.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}