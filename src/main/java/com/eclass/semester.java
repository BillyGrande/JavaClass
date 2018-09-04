package com.eclass;

import com.hibernate.JPAUtility;
import com.hibernate.StuCourseDB;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/semester")
public class semester extends HttpServlet {

    private String studentId = "P16083";

    EntityManager em = JPAUtility.getEntityManager();

    private TypedQuery<StuCourseDB> avgPerExam = em.createQuery("SELECT s from StuCourseDB  s " +
            "WHERE s.Student.ID = :id group by  s.Course.Exam, s.ID  ", StuCourseDB.class);



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        avgPerExam.setParameter("id", studentId);
        List<StuCourseDB> avgGrade = avgPerExam.getResultList();
        List<ExamData> myList = new ArrayList<>();

        int fExam = avgGrade.get(0).getCourse().getExam();
        int sum= 0;
        int i = 0;

        for (StuCourseDB temp : avgGrade) {
            int exam = temp.getCourse().getExam();

            if(fExam == exam){
                sum = sum + temp.getGrade().getGrade();
                i = i + 1;
            }else {
                ExamData e = new ExamData();
                e.setMo(sum/(i*1.0));
                e.setExam(fExam);
                myList.add(e);
                sum = temp.getGrade().getGrade();
                i = 1;
                fExam = exam;
            }
        }

        ExamData e = new ExamData();
        e.setMo(sum/(i*1.0));
        e.setExam(fExam);
        myList.add(e);


        request.setAttribute("myList", myList);
        request.getRequestDispatcher("/WEB-INF/semester.jsp").forward(request, response);

    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
