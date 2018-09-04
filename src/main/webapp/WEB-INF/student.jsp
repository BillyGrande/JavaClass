<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.10/css/all.css"
            integrity="sha284-+d0P82n9kaQMCwj8F4RJB66tzIwOKmrdb46+porD/OvrJ+27WqIM7UoBtwHO6Nlg"
            crossorigin="anonymous">
            
        <link href="http://fonts.googleapis.com/css?family=Lato:200|Grand+Hotel" rel="nofollow">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans&amp;subset=greek" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet">

        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.2/Chart.min.js"></script>


        <%
        out.println("<link rel='stylesheet' href='" + request.getContextPath() + "/base.css' type='text/css'>");
        out.println("<link rel='stylesheet' href='" + request.getContextPath() + "/navbar.css' type='text/css'>");
     	%>
		
        <title>Καρτέλα Φοιτητή</title>
    </head>

    <body>

        <!-- Navigation Bar -->
        <nav>
            <ul class="navbar" role="navigation">
                <li class="logo">unipiCMS</li>
                <li>
                    <i class="fa fa-home"></i> <a href="student">Αρχική</a></li>
                <li>
                    <i class="fas fa-graduation-cap"></i> <a href="subjects">Βαθμολογίες Μαθημάτων</a></li>

                <li>
                    <i class="fas fa-book"></i> <a href="semester">Βαθμολογίες Εξαμήνου</a></li>
                <li>
                    <i class="fa fa-info-circle"></i> <a href="logout">Αποσύνδεση</a></li>
            </ul>
        </nav>




        <!-- Main Content -->
        <main>
            <div class="grid">
                <div class="profile panel1">
                    <div class="header">

                        <h2>Καρτέλα Φοιτητή</h2>
                    </div>
                    <div class="details">
                        <table>

                            <head>
                                <tr>
                                    <th>ΑΜ</th>
                                    <th>Όνομα</th>
                                    <th>Επίθετο</th>
                                    <th>Εξάμηνο</th>
                                    <th>Email</th>
                                    <th>Τηλέφωνο</th>
                                </tr>
                            </head>
                            <tbody>
                                <tr>
                                    <th>${myData.getID()}</th>
                                    <th>${myData.getName()}</th>
                                    <th>${myData.getSurname()}</th>
                                    <th>${myData.getExam()}</th>
                                    <th>${myData.getEmail()}</th>
                                    <th>${myData.getTel()}</th>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>

                <div class="average panel">
                    <div class="info">
                        <h2>${MO}</h2>
                    </div>
                    <div class="learn_more average">
                        <p>Μέσος Όρος</p>
                    </div>
                </div>

                <div class="semester panel">
                    <div class="info">
                        <h2>${myData.getExam()}ο</h2>
                    </div>
                    <div class="learn_more semester">
                        <p>Εξάμηνο</p>
                    </div>
                </div>

                <div class="pass panel">
                    <div class="info">
                        <h2>${passed}</h2>
                    </div>
                    <div class="learn_more pass">
                        <p>Περασμένα Μαθήματα</p>
                    </div>
                </div>

                <div class="failed panel">
                    <div class="info">
                        <h2>${failed}</h2>
                    </div>
                    <div class="learn_more failed">
                        <p>Κομμένα Μαθήματα</p>
                    </div>
                </div>

                <div class="news panel1">
                    <div class="header">

                        <h2>Τελευταίες Ανακοινώσεις</h2>
                    </div>
                    <div class="details">
                        <ul>
                            <li>Το μάθημα Χ βγήκε!</li>
                            <li>Το μάθημα Χ βγήκε!</li>
                            <li>Το μάθημα Χ βγήκε!</li>
                            <li>Το μάθημα Χ βγήκε!</li>
                        </ul>
                    </div>
                </div>

                <div class="stats panel1">
                    <div class="header">

                        <h2>Στατιστικά Στοιχεία</h2>
                    </div>
                    <div class="details">
                        <canvas id="myChart" width="400" height="200"></canvas>
                        <script>
                            var ctx = document.getElementById("myChart").getContext(
                                '2d');
                            var myChart = new Chart(ctx, {
                                type: 'bar',
                                data: {
                                    labels: ["Συνολικά", "Περασμένα",
                                        "Κομμένα",
                                        "Γενικής", "Επιλογής",
                                        "Orange"
                                    ],
                                    datasets: [{
                                        label: 'Περί Μαθημάτων',
                                        data: [12, 19, 3, 5, 2,
                                            3
                                        ],
                                        backgroundColor: [
                                            'rgba(255, 99, 132, 0.2)',
                                            'rgba(54, 162, 235, 0.2)',
                                            'rgba(255, 206, 86, 0.2)',
                                            'rgba(75, 192, 192, 0.2)',
                                            'rgba(153, 102, 255, 0.2)',
                                            'rgba(255, 159, 64, 0.2)'
                                        ],
                                        borderColor: [
                                            'rgba(255,99,132,1)',
                                            'rgba(54, 162, 235, 1)',
                                            'rgba(255, 206, 86, 1)',
                                            'rgba(75, 192, 192, 1)',
                                            'rgba(153, 102, 255, 1)',
                                            'rgba(255, 159, 64, 1)'
                                        ],
                                        borderWidth: 1
                                    }]
                                },
                                options: {
                                    scales: {
                                        yAxes: [{
                                            ticks: {
                                                beginAtZero: true
                                            }
                                        }]
                                    }
                                }
                            });
                        </script>
                    </div>
                </div>
            </div>
        </main>



    </body>

</html>