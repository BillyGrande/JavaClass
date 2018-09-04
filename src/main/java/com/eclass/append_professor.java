package com.eclass;

import com.hibernate.CourseDB;
import com.hibernate.JPAUtility;
import com.hibernate.ProfessorDB;
import org.hibernate.Hibernate;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/append_professor")
public class append_professor extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        request.getRequestDispatcher("/WEB-INF/append_professor.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        EntityManager em = JPAUtility.getEntityManager();

        // Form Data
        String id = request.getParameter("id_sub");
        String exam = request.getParameter("exam");
        String title = request.getParameter("title");
        String prof_id = request.getParameter("prof_id");

        try {
            CourseDB c = new CourseDB();
            c.setID(Integer.parseInt(id));
            c.setExam(Short.parseShort(exam));
            c.setTitle(title);
            ProfessorDB p;
            p = em.find(ProfessorDB.class, prof_id);
            c.setProfessor(p);
            em.unwrap(Session.class).save(c);
            request.getRequestDispatcher("/WEB-INF/secretary.jsp").forward(request, response);
        }catch (Exception e){
            request.getRequestDispatcher("/WEB-INF/append_professor.jsp").forward(request, response);
        }




    }

}

