package com.eclass;

import com.hibernate.JPAUtility;
import com.hibernate.ProfessorDB;
import com.hibernate.SecretaryDB;
import com.hibernate.StudentDB;
import org.hibernate.Hibernate;
import org.mindrot.jbcrypt.BCrypt;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class login extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("username");
        String password = request.getParameter("password");
        String hashedPass;
        String re = "";

        EntityManager em = JPAUtility.getEntityManager();

        try {
            if (id.startsWith("S")){
                SecretaryDB usr = null;
                usr = em.find(SecretaryDB.class, id);
                Hibernate.initialize(usr);
                hashedPass = usr.getPassword();
                re = "secretary";

            }else if (id.startsWith("T")){
                ProfessorDB usr = null;
                usr = em.find(ProfessorDB.class, id);
                Hibernate.initialize(usr);
                hashedPass = usr.getPassword();
                re = "professors";

            }else{

                StudentDB usr = null;
                usr = em.find(StudentDB.class, id);
                Hibernate.initialize(usr);
                hashedPass = usr.getPassword();
                re = "student";
            }
        }catch (Exception e){
            e.printStackTrace();
            hashedPass = "$2a$12$TR6p2q3Lj3h7bveJdpAlquy4qwIiTbC./p/tLypbkwibnq8ehuNAe";
        }finally {

        }


        if(BCrypt.checkpw(password, hashedPass)){
            response.sendRedirect(re);
        }else{
            request.setAttribute("error", "Wrong credentials. Please try again!");
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }

    }
}

