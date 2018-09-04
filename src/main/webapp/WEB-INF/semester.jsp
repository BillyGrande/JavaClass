<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>


<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.0.10/css/all.css"
	integrity="sha284-+d0P82n9kaQMCwj8F4RJB66tzIwOKmrdb46+porD/OvrJ+27WqIM7UoBtwHO6Nlg"
	crossorigin="anonymous">
<link href="http://fonts.googleapis.com/css?family=Lato:200|Grand+Hotel"
	rel="nofollow">
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans&amp;subset=greek"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Lato"
	rel="stylesheet">

<%
	out.println("<link rel='stylesheet' href='" + request.getContextPath() + "/base.css' type='text/css'>");
	out.println("<link rel='stylesheet' href='" + request.getContextPath() + "/navbar.css' type='text/css'>");
	out.println("<link rel='stylesheet' href='" + request.getContextPath() + "/tables.css' type='text/css'>");
%>
<title>Βαθμολογίες Μαθημάτων</title>

</head>

<body>
	<nav>
		<ul class="navbar" role="navigation">
			<li class="logo">unipiCMS</li>
			<li><i class="fa fa-home"></i> <a href="student">Αρχική</a></li>
			<li><i class="fas fa-graduation-cap"></i> <a href="subjects">Βαθμολογίες
					Μαθημάτων</a></li>

			<li><i class="fas fa-book"></i> <a href="semester">Βαθμολογίες
					Εξαμήνου</a></li>
			<li><i class="fa fa-info-circle"></i> <a href="logout">Αποσύνδεση</a></li>
		</ul>
	</nav>

	<main>
	<div class="grid">
		<table id="subjects">
			<tr>
				<th>Εξάμηνο</th>
				<th>Βαθμολογία</th>
			</tr>
			<c:forEach items="${myList}" var="item">
				<tr>
					<td>${item.getExam()}ο</td>
					<td>${item.getMo()}/10</td>

				</tr>
			</c:forEach>
		</table>
	</div>
	</main>

</body>

</html>