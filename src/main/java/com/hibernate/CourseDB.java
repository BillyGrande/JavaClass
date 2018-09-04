package com.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "\"Course\"" )
public class CourseDB {

    @Id
    @Column(name = "\"ID\"", nullable = false)
    private int ID;

    @Column(name = "\"Title\"", nullable = false)
    private String Title;

    @Column(name = "\"Exam\"", nullable = false)
    private Short Exam;

    @ManyToOne
    @JoinColumn(name = "\"ID_Professor\"", nullable = false)
    private ProfessorDB Professor;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Short getExam() {
        return Exam;
    }

    public void setExam(short exam) {
        Exam = exam;
    }

    public ProfessorDB getProfessor() {
        return Professor;
    }

    public void setProfessor(ProfessorDB professor) {
        Professor = professor;
    }
}
