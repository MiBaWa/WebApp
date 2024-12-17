package edu.fra.uas.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;

public class User implements Serializable {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(User.class);

    private long id;
    private String role;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private List<Double> grades;

    public User() {
        log.debug("User created without values");
        this.grades = new ArrayList<>();
    }

    public User(long id, String role, String firstName, String lastName, String email, String password) {
        log.debug("User created with values + id: " + id + " role: " + role + " firstName: " + firstName + " lastName: " + lastName + " email: " + email + " password: " + password);
        this.id = id;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.grades = new ArrayList<>();
    }

    // Getter und Setter für alle Felder

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public void addGrade(double grade) {
        this.grades.add(grade);
    }

    public double calculateAverage() {
        return grades.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) 
            return false;
        if (object == this) 
            return true;
        if (this.getClass() != object.getClass()) 
            return false;
        if (this.firstName == null) {
            if (((User)object).firstName != null) 
                return false;
        } else if (!this.firstName.equals(((User)object).firstName)) {
            return false;
        }
        if (this.lastName == null) {
            if (((User)object).lastName != null) 
                return false;
        } else if (!this.lastName.equals(((User)object).lastName)) {
            return false;
        }
        if (this.email == null) {
            if (((User)object).email != null) 
                return false;
        } else if (!this.email.equals(((User)object).email)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (this.firstName != null ? this.firstName.hashCode() : 0);
        hash = 31 * hash + (this.lastName != null ? this.lastName.hashCode() : 0);
        hash = 31 * hash + (this.email != null ? this.email.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", role=" + role + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
                + email + ", password=" + password + "]";
    }

}
