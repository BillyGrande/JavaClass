package com.eclass;

public class SubjectData {

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getExam() {
        return exam;
    }
    public void setExam(int exam) {
        this.exam = exam;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    private int id;
    private String title;
    private int exam;
    private int score;

    public String getProfessor_id() {
        return professor_id;
    }
    public void setProfessor_id(String professor_id) {
        this.professor_id = professor_id;
    }
    public String getProfessor_name() {
        return professor_name;
    }
    public void setProfessor_name(String professor_name) {
        this.professor_name = professor_name;
    }
    private String professor_id;
    private String professor_name;

}
