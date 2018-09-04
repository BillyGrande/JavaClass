package com.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "\"Grade\"")
public class GradeDB {

    @Id
    private int ID;

    @OneToOne
    @JoinColumn(name = "\"ID_Stu_Courses\"")
    @MapsId
    private StuCourseDB Course;

    @Column(name = "\"Grade\"")
    private Short Grade;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public StuCourseDB getCourse() {
        return Course;
    }

    public void setCourse(StuCourseDB course) {
        Course = course;
    }

    public Short getGrade() {
        return Grade;
    }

    public void setGrade(Short grade) {
        Grade = grade;
    }
}
