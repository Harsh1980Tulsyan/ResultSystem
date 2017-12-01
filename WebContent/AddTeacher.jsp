<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>AddTeacher</title>
</head>
<body>
	<div>
		<h1 style="border:2px solid red;text-align:center;background:pink">Add Teacher Details</h1>
	</div>
	
	<form method="post"action="AddTeacher">
		 <table style="color:red">
			<tr>
				<td><h2>Name</h2></td>
				<td><input type="text" name="name" required autofocus></td>
			</tr>
			<tr>
				<td><h2>Subject Assign</h2></td>
				<td><input type="text" name="subject" required autofocus></td>
			</tr>
			<tr>
              <td><h2>Username</h2></td>
              <td><input type="text" name="username" required autofocus></td>
              </tr>
			<tr>
				<td><h2>Password</h2></td>
				<td><input type="password" name="password" required autofocus></td>
			</tr>
			<tr>
				<td><h2>Course Code</h2></td>
				<td><input type="text" name="coursecode" required autofocus></td>
			</tr>
			<tr>
				<td ><input style="font-size:20px;color:blue;font-style:italic" type="submit" value="SUBMIT" required ></td>
				</tr>
		</table>
	</form>

</body>
</html>