package edu.fra.uas;

import java.util.Scanner;
import edu.fra.uas.service.NotenService;

public class main {
    public static void main(String[] args) {
        NotenService notenService = new NotenService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptionen:");
            System.out.println("1. Neuen Studenten hinzufügen");
            System.out.println("2. Fach zu einem Studenten hinzufügen");
            System.out.println("3. Note zu einem Fach hinzufügen");
            System.out.println("4. Notendurchschnitt eines Studenten anzeigen");
            System.out.println("5. Alle Studenten anzeigen");
            System.out.println("6. Beenden");
            System.out.print("Wählen Sie eine Option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Studenten-ID: ");
                    Long studentId = scanner.nextLong();
                    scanner.nextLine(); // Puffer leeren
                    System.out.print("Name des Studenten: ");
                    String name = scanner.nextLine();
                    Student student = new Student(studentId, name);
                    notenService.addStudent(student);
                    System.out.println("Student hinzugefügt.");
                    break;

                case 2:
                    System.out.print("Studenten-ID: ");
                    studentId = scanner.nextLong();
                    scanner.nextLine(); // Puffer leeren
                    System.out.print("Name des Faches: ");
                    String fachName = scanner.nextLine();
                    Fach fach = new Fach(fachName);
                    notenService.addFachToStudent(studentId, fach);
                    System.out.println("Fach hinzugefügt.");
                    break;

                case 3:
                    System.out.print("Studenten-ID: ");
                    studentId = scanner.nextLong();
                    scanner.nextLine(); // Puffer leeren
                    System.out.print("Name des Faches: ");
                    fachName = scanner.nextLine();
                    System.out.print("Note: ");
                    double wert = scanner.nextDouble();
                    Note note = new Note(wert);
                    notenService.addNoteToFach(studentId, fachName, note);
                    System.out.println("Note hinzugefügt.");
                    break;

                case 4:
                    System.out.print("Studenten-ID: ");
                    studentId = scanner.nextLong();
                    double durchschnitt = notenService.calculateDurchschnitt(studentId);
                    System.out.printf("Notendurchschnitt: %.2f%n", durchschnitt);
                    break;

                case 5:
                    System.out.println("Alle Studenten:");
                    for (Student s : notenService.getAllStudents()) {
                        System.out.println("ID: " + s.getId() + ", Name: " + s.getName());
                    }
                    break;

                case 6:
                    System.out.println("Programm beendet.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Ungültige Option. Bitte erneut versuchen.");
            }
        }
    }
}
