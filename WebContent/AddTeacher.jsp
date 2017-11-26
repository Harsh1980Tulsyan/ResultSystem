<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>AddTeacher</title>
</head>
<body>
	<div>
		<h1 style="border:2px solid red;text-align:center">Add Teacher Details</h1>
	</div>
	
	<form method="post"action="AddTeacher">
		 <table style="color:red">
			<tr>
				<td><h3>Name</h3></td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td><h3>Subject Assign</h3></td>
				<td><input type="text" name="subject"></td>
			</tr>
			<tr>
              <td><h3>Username</h3></td>
              <td><input type="text" name="username"></td>
              </tr>
			<tr>
				<td><h3>Password</h3></td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td ><input style="font-size:15px;color:blue" type="submit" value="SUBMIT"></td>
				</tr>
		</table>
	</form>

</body>
</html>