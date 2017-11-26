<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>AddSubject</title>
</head>
<body>
	<div>
		<h1 style="border:2px solid red;text-align:center">Add Subject Details</h1>
	</div>
	<form method="get"action="AddSubject">
		 <table style="color:red">
			<tr>
				<td><h3>Course Code</h3></td>
				<td><input type="text" name="coursecode"></td>
			</tr>
			<tr>
				<td><h3>Course Name</h3></td>
				<td><input type="text" name="coursename"></td>
			</tr>
			<tr>
              <td><h3>Total Credit</h3></td>
              <td><input type="number" name="totalcredit"></td>
              </tr>
			<tr>
			<td ><input style="font-size:15px;color:blue" type="submit" value="SUBMIT"></td>
				</tr>
		</table>
	</form>

</body>
</html>