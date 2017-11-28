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
		<h1 style="border:2px solid red;text-align:center;background:pink">Add Student Details</h1>
	</div>
	<form method="post"action="AddStudent">
		 <table style="color:red">
			<tr>
				<td><h2>Student name</h2></td> 
				<td><input type="text" name="studentname" required autofocus></td>
			</tr>
			<tr>
				<td><h2>Roll No</h2></td>
				<td><input type="text" name="rollno" required autofocus></td>
			</tr>
			<tr>
              <td><h2>Date of Birth</h2></td>
              <td><input type="date" name="dateofbirth" required autofocus></td>
              </tr>
			<tr>
			<td ><input style="font-size:20px;color:blue;font-style:italic" type="submit" value="SUBMIT" required ></td>
			</tr>
		</table>
	</form>
</body>
</html>