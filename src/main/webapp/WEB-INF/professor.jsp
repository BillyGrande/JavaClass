<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>

<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link
	href="https://fonts.googleapis.com/css?family=Open+Sans&amp;subset=greek"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Lato"
	rel="stylesheet">

<%
	out.println("<link rel='stylesheet' href='" + request.getContextPath() + "/secretary.css' type='text/css'>");
%>

<title>Καθηγητές</title>

</head>

<body>
        <main>
            <div class="boarder">
                <h2 class="active"> ΛΕΙΤΟΥΡΓΙΕΣ ΚΑΘΗΓΗΤΩΝ </h2>
                <br>
                <a href="view_list">Προβολη Λίστας Βαθμολογίας</a>
                <a href="insert_mark">Καταχωρηση Βαθμολγιας</a>
                <a href="logout">Αποσυνδεση</a>
            </div>
        </main>
</body>

</html>