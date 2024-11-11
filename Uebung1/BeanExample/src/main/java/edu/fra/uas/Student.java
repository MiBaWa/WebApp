package edu.fra.uas;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private Long id;
    private String name;
    private List<Fach> fachList;

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
        this.fachList = new ArrayList<>();
    }

    public void addFach(Fach fach) {
        fachList.add(fach);
    }

    public double getDurchschnitt() {
        return fachList.stream()
                        .mapToDouble(Fach::getDurchschnitt)
                        .average()
                        .orElse(0.0);
        }
     
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Fach> getFachList() {
        return fachList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}




