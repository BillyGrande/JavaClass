<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <html>

    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


        <link href="https://fonts.googleapis.com/css?family=Open+Sans&amp;subset=greek" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet">
        
        <%
        out.println("<link rel='stylesheet' href='" + request.getContextPath() + "/login.css' type='text/css'>");
     	%>
     	
        <title>ΑΝΑΘΕΣΗ ΚΑΘΗΓΗΤΗ</title>

    </head>
    <body>
        <main>
            <div class="form">
                <h2 class="active"> ΑΝΑΘΕΣΗ ΚΑΘΗΓΗΤΗ </h2>
	
                <form method="post">
                    <input type="text" name="id_sub" placeholder="ID Μαθήματος">
                    <input type="text" name="title" placeholder="Τίτλος Μαθήματος">
                    <input type="text" name="exam" placeholder="Εξάμηνο Μαθήματος">
                    <input type="text" name="prof_id" placeholder="ID Καθηγητή">
                    <input type="submit" value="ΑΝΑΘΕΣΗ">
                </form>
                <div class="footer">
                    <a href="secretary">ΠΊΣΩ</a>
                </div>
            </div>
        </main>
    </body>

    </html>