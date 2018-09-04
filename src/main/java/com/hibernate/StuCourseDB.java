package com.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "\"Stu_Courses\"")
public class StuCourseDB {

    @Id
    @Column(name = "\"ID\"")
    private int ID;

    @ManyToOne
    @JoinColumn(name = "\"StudentID_Student\"")
    private StudentDB Student;

    @ManyToOne
    @JoinColumn(name = "\"ID_Course\"")
    private CourseDB Course;

    @OneToOne(mappedBy = "Course")
    private GradeDB Grade;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public StudentDB getStudent() {
        return Student;
    }

    public void setStudent(StudentDB student) {
        Student = student;
    }

    public CourseDB getCourse() {
        return Course;
    }

    public void setCourse(CourseDB course) {
        Course = course;
    }

    public GradeDB getGrade() {
        return Grade;
    }

    public void setGrade(GradeDB grade) {
        Grade = grade;
    }

}
