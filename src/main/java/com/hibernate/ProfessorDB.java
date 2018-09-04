package com.hibernate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "\"Professors\"")
public class ProfessorDB {

    @Id
    @Column(name = "\"ID\"", nullable = false)
    private String ID;

    @Column(name = "\"Name\"", nullable = false)
    private String Name;

    @Column(name = "\"Surname\"", nullable = false)
    private String Surname;

    @Column(name ="\"Email\"", nullable = false)
    private String Email;

    @Column(name = "\"Tel\"", nullable = false)
    private Long Tel;

    @Column(name = "\"Years_Of_Service\"")
    private Short YearsOfService;

    @Column(name = "\"Password\"")
    private String Password;

    @OneToMany(mappedBy = "Professor")
    private List<CourseDB> Courses = new ArrayList<CourseDB>();

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Long getTel() {
        return Tel;
    }

    public void setTel(long tel) {
        Tel = tel;
    }

    public Short getYearsOfService() {
        return YearsOfService;
    }

    public void setYearsOfService(short yearsOfService) {
        YearsOfService = yearsOfService;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public List<CourseDB> getCourses() {
        return Courses;
    }

    public void setCourses(List<CourseDB> courses) {
        Courses = courses;
    }
}
