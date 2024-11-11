package edu.fra.uas;

import java.util.List;
import java.util.ArrayList;

public class Fach {

        private String name;
        private List<Note> notenList; 
 
        public Fach(String name) {
            this.name = name;
            this.notenList = new ArrayList<>();
        }

        public void addNote (Note note) {
            this.notenList.add(note);
        }

        public double getDurchschnitt() {
            return notenList.stream()
                            .mapToDouble(Note::getWert)
                            .average()
                            .orElse(0.0);
        }


        public String getName() {
            return name;
        }

        public List<Note> getNotenList() {
            return notenList;
        }

        public void setName(String name) {
            this.name = name;
        }
}
