package com.eclass;

import com.hibernate.CourseDB;
import com.hibernate.JPAUtility;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/view_subjects")
public class view_subjects extends HttpServlet {


    EntityManager em = JPAUtility.getEntityManager();

    TypedQuery<CourseDB> SelectAll = em.createQuery("Select c from com.hibernate.CourseDB c ORDER BY c.Exam", CourseDB.class);
    List<CourseDB> courses = SelectAll.getResultList();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String studentid = "P16083";

        request.setAttribute("myList", courses);
        request.getRequestDispatcher("/WEB-INF/view_subjects.jsp").forward(request, response);

    }
}