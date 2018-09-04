<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

    <head>


        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.10/css/all.css"
            integrity="sha284-+d0P82n9kaQMCwj8F4RJB66tzIwOKmrdb46+porD/OvrJ+27WqIM7UoBtwHO6Nlg"
            crossorigin="anonymous">
        <link href="http://fonts.googleapis.com/css?family=Lato:200|Grand+Hotel" rel="nofollow">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans&amp;subset=greek" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet">

        <%
        out.println("<link rel='stylesheet' href='" + request.getContextPath() + "/base.css' type='text/css'>");
        out.println("<link rel='stylesheet' href='" + request.getContextPath() + "/navbar.css' type='text/css'>");
        out.println("<link rel='stylesheet' href='" + request.getContextPath() + "/tables.css' type='text/css'>");
     	%>
        <title>Προβολή Πληροφοριών Μαθημάτων</title>
		        <style>
            a {
                font-family: 'Open Sans', sans-serif;
                background-color: #56baed;
                border: none;
                color: white;
                padding: 15px 80px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                text-transform: uppercase;
                font-size: 13px;
                border-radius: 5px 5px 5px 5px;
                margin-top: 10px;
            }
        </style>
		
    </head>

    <body>

        <main>
            <div class="grid">
                <table id="subjects">
                    <tr>
                        <th>ID</th>
                        <th>Τίτλος Μαθήματος</th>
                        <th>Εξάμηνο</th>
                        <th>Όνομα Καθηγητή</th>
                        <th>ID Καθηγητή</th>
                    </tr>
                    <c:forEach items="${myList}" var="item">
                        <tr>
                            <td>${item.getID()}</td>
                            <td>${item.getTitle()}</td>
                            <td>${item.getExam()}</td>
                            <td>${item.getProfessor().getName()} ${item.getProfessor().getSurname()} </td>
                            <td>${item.getProfessor().getID()}</td>
                        </tr>
                    </c:forEach>

                </table>
                                <a href="secretary">Πίσω</a>

            </div>
        </main>

    </body>

</html>