<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.resultsystem.dao.DatabaseAccess,java.sql .*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
 table {
    border-collapse: collapse;
}

 table, td, th {
    border: 1px solid black;
}
input{
 border:none;
}
</style>
</head>
<body>
<table>
<tr>
<th>Name</th><th>Roll No</th><th>Test 1 Marks</th>
</tr>
<%
ResultSet rs=new DatabaseAccess().getStudent();
while(rs.next())
{
	String name=rs.getString(1);
	String roll=rs.getString(2);
%>
<tr>
<td><%=name%></td><td><%=roll%></td><td><input type="text"></td>
</tr>	
<%
}
%>
</table>
<br><br><br>
<input           type="submit" value="SUBMIT" >
</body>
</html>