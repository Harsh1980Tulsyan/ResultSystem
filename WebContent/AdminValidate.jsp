<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>ValidateAdmin</title>
</head>
<body>
	<div><h1 style="text-align: center;">Admin Detail</h1></div>
	<hr>

	<form method="post"action="AdminValidation">
		 <table>
			<tr>
				<td><h3 style="color: red">Username</h3></td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td><h3 style="color: red">Password</h3></td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr> <td><input style="color:blue;text-font:20px" type="submit" value="LOGIN"></td></tr>
		</table></form>

</body>
</html>