package com.eclass;

import com.hibernate.JPAUtility;
import com.hibernate.StuCourseDB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/subjects")
public class subjects extends HttpServlet {


    /*String SUBJECTS_SCORE = "SELECT \"Course\".\"ID\", \"Course\".\"Title\", \"Course\".\"Exam\", \"Grade\".\"Grade\" FROM \"Grade\"\r\n" +
            "INNER JOIN \"Stu_Courses\" ON \"Stu_Courses\".\"ID\" = \"Grade\".\"ID_Stu_Courses\"\r\n" +
            "INNER JOIN \"Course\" ON \"Course\".\"ID\" = \"Stu_Courses\".\"ID_Course\"\r\n" +
            "WHERE \"Stu_Courses\".\"StudentID_Student\" = ? ;";
    */

    EntityManager em = JPAUtility.getEntityManager();

    private TypedQuery<StuCourseDB> subject = em.createQuery("SELECT s from StuCourseDB  s " +
            "WHERE s.Student.ID = :id group by  s.Course.Exam, s.ID  ", StuCourseDB.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String studentid = "P16083";
        subject.setParameter("id", studentid);
        List<StuCourseDB> subjects = subject.getResultList();


        request.setAttribute("myList", subjects);
        request.getRequestDispatcher("/WEB-INF/subjects.jsp").forward(request, response);


    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
