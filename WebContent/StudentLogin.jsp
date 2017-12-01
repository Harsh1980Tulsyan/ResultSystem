<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>StudentLogin</title>
</head>
<body>
	<div><h1 style="text-align: center;background:pink;border:2px solid red;">Student Portal</h1></div>

	<form method="post"action="StudentValidation">
		 <table>
			<tr>
				<td><h2 style="color: red">Name</h2></td>
				<td><input type="text" name="name" required autofocus></td>
			</tr>
			<tr>
				<td><h2 style="color: red">Roll No</h2></td>
				<td><input type="password" name="rollno" required autofocus></td>
			</tr>
			<tr> <td><input style="color:blue;font-size:20px;font-style:italic"  id="submit" type="submit" value="LOGIN" required ></td></tr>
		</table></form>
</body>
</html>