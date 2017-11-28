<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>AddSubject</title>
</head>
<body>
	<div>
		<h1 style="border:2px solid red;text-align:center;background:pink">Add Subject Details</h1>
	</div>
	<form method="get"action="AddSubject">
		 <table style="color:red">
			<tr>
				<td><h2>Course Code</h2></td>
				<td><input type="text" name="coursecode" required autofocus></td>
			</tr>
			<tr>
				<td><h2>Course Name</h2></td>
				<td><input type="text" name="coursename" required autofocus></td>
			</tr>
			<tr>
              <td><h2>Total Credit</h2></td>
              <td><input type="number" name="totalcredit" required autofocus></td>
              </tr>
			<tr>
			<td ><input style="font-size:20px;color:blue;font-style:italic" type="submit" value="SUBMIT" required></td>
				</tr>
		</table>
	</form>

</body>
</html>