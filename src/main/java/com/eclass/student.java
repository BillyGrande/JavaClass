package com.eclass;

import com.hibernate.JPAUtility;
import com.hibernate.StudentDB;

import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

@WebServlet("/student")
public class student extends HttpServlet {

    EntityManager em = JPAUtility.getEntityManager();

    TypedQuery<StudentDB> studentQuery = em.createQuery("SELECT s FROM StudentDB s WHERE s.ID=:id", StudentDB.class);

    TypedQuery<Double> moQuery = em.createQuery("SELECT AVG(g.Grade.Grade) FROM StuCourseDB  g" +
            " where  g.Student.ID = :id", Double.class);

    TypedQuery<Long> passedQuery =  em.createQuery("SELECT count(p) from StuCourseDB p " +
            "where p.Grade.Grade >= 5 AND p.Student.ID =:id", Long.class);

    TypedQuery<Long> failedQuery =  em.createQuery("SELECT count(f) from StuCourseDB f " +
            "where f.Grade.Grade < 5 AND  f.Student.ID =:id", Long.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String studentId = "P16083";

        studentQuery.setParameter("id", studentId);
        moQuery.setParameter("id", studentId);
        passedQuery.setParameter("id", studentId);
        failedQuery.setParameter("id", studentId);



        StudentDB student = studentQuery.getSingleResult();
        Double mo = moQuery.getSingleResult();
        Long passed = passedQuery.getSingleResult();
        Long failed = failedQuery.getSingleResult();


        request.setAttribute("myData", student);
        request.setAttribute("MO", mo);
        request.setAttribute("passed", passed);
        request.setAttribute("failed", failed);


        request.getRequestDispatcher("/WEB-INF/student.jsp").forward(request, response);



    }

}
