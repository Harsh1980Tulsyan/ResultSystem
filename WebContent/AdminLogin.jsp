<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>ValidateAdmin</title>
</head>
<body>
	<div><h1 style="text-align: center;background:pink;border:2px solid red;">Admin Detail</h1></div>

	<form method="post"action="AdminValidation">
		 <table>
			<tr>
				<td><h2 style="color: red">Username</h2></td>
				<td><input type="text" name="username" required autofocus></td>
			</tr>
			<tr>
				<td><h2 style="color: red">Password</h2></td>
				<td><input type="password" name="password" required autofocus></td>
			</tr>
			<tr> <td><input style="color:blue;font-size:20px;font-style:italic" type="submit" value="LOGIN" required ></td></tr>
		</table></form>

</body>
</html>