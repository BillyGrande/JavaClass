package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"Student\"")
public class StudentDB {

    @Id
    @Column(name = "\"StudentID\"", nullable = false)
    private String ID;

    @Column(name = "\"Name\"", nullable = false)
    private String Name;

    @Column(name = "\"Surname\"", nullable = false)
    private String Surname;

    @Column(name = "\"Exam\"", nullable = false)
    private Short Exam;

    @Column(name = "\"Email\"")
    private String Email;

    @Column(name = "\"Tel\"")
    private Long Tel;

    @Column(name = "\"Password\"", nullable = false)
    private String Password;

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

    public Short getExam() {
        return Exam;
    }

    public void setExam(Short exam) {
        Exam = exam;
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

    public void setTel(Long tel) {
        Tel = tel;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}

