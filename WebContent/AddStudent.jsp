<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddStudent</title>
</head>
<body>

<div>
		<h1 style="border:2px solid red;text-align:center">Add Student Details</h1>
	</div>
	<form method="post"action="AddStudent">
		 <table style="color:red">
			<tr>
				<td><h3>Student name</h3></td>
				<td><input type="text" name="studentname"></td>
			</tr>
			<tr>
				<td><h3>Course Name</h3></td>
				<td><input type="text" name="rollno"></td>
			</tr>
			<tr>
              <td><h3>Date of Birth</h3></td>
              <td><input type="date" name="dateofbirth"></td>
              </tr>
			<tr>
			<td ><input style="font-size:15px;color:blue" type="submit" value="SUBMIT"></td>
				</tr>
		</table>
	</form>
</body>
</html>