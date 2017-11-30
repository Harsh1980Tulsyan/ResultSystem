<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*,java.io.*,com.resultsystem.dao.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FinalGrade</title>
<style>
 table {
    border-collapse: collapse;
}

 table, td, th {
    border: 1px solid black;
}
</style>
</head>
<body>
<%
HttpSession s=request.getSession(false);
String coursecode=(String)s.getAttribute("coursecode");
%>
<h2 style="color:blue;text-align:center;"><%=coursecode%></h2>
<a href="WelcomeTeacher.jsp"><h3 style="text-align:left;">Home</h3></a>
<table>
<tr>
<th>Name</th>
<th>Rollno</th>
<th>Test 1</th>
<th>Test 2</th>
<th>End Sem</th>
<th>Attendence</th>
<th>Quiz</th>
<th>Assignment</th>
<th>Grade</th>
</tr>
<%
//HttpSession s=request.getSession(false);
//String coursecode=(String)s.getAttribute("coursecode");
try {
	Connection c=new Dbcon().getConnection();
	PreparedStatement ps=c.prepareStatement("select * FROM "+ coursecode);
	ResultSet rs=ps.executeQuery();
	while(rs.next())
	{
	%>
	<tr>
<th><%=rs.getString(1)%></th>
<th><%=rs.getString(2) %></th>
<th><%=rs.getInt(3) %></th>
<th><%=rs.getInt(4) %></th>
<th><%=rs.getInt(5) %></th>
<th><%=rs.getInt(6) %></th>
<th><%=rs.getInt(7) %></th>
<th><%=rs.getInt(8) %></th>
<th><%=rs.getString(9) %></th>
</tr>
<%
}
}
catch(Exception e)
{
	e.printStackTrace();
}

%>
</table>
</body>
</html>