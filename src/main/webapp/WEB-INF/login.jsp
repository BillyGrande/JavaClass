<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <html>

    <head>
        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href="https://fonts.googleapis.com/css?family=Open+Sans&amp;subset=greek" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet">

        <%
        out.println("<link rel='stylesheet' href='" + request.getContextPath() + "/login.css' type='text/css'>");
     	%>

            <title>ΣΥΝΔΕΣΗ</title>

    </head>

    <body>
        <main>
            <div class="form">
                <h2 class="active"> ΣΥΝΔΕΣΗ </h2>
                <%
		        out.println("<img src='https://i.imgur.com/idbpR5b.png' type='text/css'>");
		     	%>
                    <form method="post">
                        <input type="text" name="username" placeholder="Αριθμός Μητρώου">
                        <input type="password" name="password" placeholder="Κωδικός Πρόσβασης">
                        <input type="submit" value="Σύνδεση">
                    </form>
                    <% String error = (String)request.getAttribute("error"); %>

                        <% if(error != null){
    				out.print("<div class='error'><h2>Wrong credentials. Please try again!</h2></div>");
				} 
				%>
                            <div class="footer">
                                <a href="#">Ξέχασα τον κωδικό</a>
                            </div>
            </div>
        </main>
    </body>

    </html>