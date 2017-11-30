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
border:none;}
</style>
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<script  type="text/javascript" src="script.js"></script>
</head>
<body>
<%
String subject=request.getParameter("subject");
%>
<h1 style="text-align:center">ENTER  <%=subject %>  MARKS</h1>
<a href="WelcomeTeacher.jsp"><h3 style="text-align:left;">Home</h3></a>
<table>
<tr>
<th>Name</th><th>Roll No</th><th>Marks</th>
</tr>
<form type="post" action="AddMarks">
<%
ResultSet rs=new DatabaseAccess().getStudent();
while(rs.next())
{
	String name=rs.getString(1);
	String roll=rs.getString(2);
%>
<tr>
<td><%=name%></td><td ><%=roll%></td><td><input type="text" name="<%=roll%>"></td>
</tr>	
<%
}
%>
</table>
<br><br><br>
<input id="button" type="button" value="SUBMIT">
<input id="svalue" type="hidden" value=<%=subject%>>
</form>
</body>
</html>