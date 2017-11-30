<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Welcome Teacher</title>
	<link href="https://fonts.googleapis.com/css?family=Yanone+Kaffeesatz" rel="stylesheet">
	<style type="text/css">
		body{
			font-family: 'Yanone Kaffeesatz', sans-serif;
		}
		ul{
			list-style: none;
		}
		a{
			text-decoration: none;
			color: #2874A6;
		}
		a:hover{
			color: #E74C3C;
		}

	</style>
</head>
 <body>
	<div class="head">
        <h1 style="color: #E74C3C; text-align:center;">Teacher Portal</h1>
        <a href="Logout"><h2 style="color: #E74C3C; text-align:right;">LOGOUT </h2></a>
	</div>
	<hr>
	<div style="text-align: center;">
	<ul>
		<li><a href="AddMarks.jsp?subject=TEST_1"><h2>Add Test 1 Marks</h2></li>
		<li><a href="AddMarks.jsp?subject=TEST_2"><h2>Add Test 2 Marks</h2></a></li>
		<li><a href="AddMarks.jsp?subject=END_SEM"><h2>Add EndSem Marks</h2></a></li>
		<li><a href="AddMarks.jsp?subject=ATTENDENCE"><h2>Add Attendence</h2></a></li>
		<li><a href="AddMarks.jsp?subject=QUIZ"><h2>Add Quiz Marks</h2></a></li>
		<li><a href="AddMarks.jsp?subject=ASSIGNMENT"><h2>Add Assignment Marks</h2></a></li>
		<li><a href="CalculateGrade"><h2>Show Final Grade</h2></a></li>
	</ul>
	</div>

</body>
</html>