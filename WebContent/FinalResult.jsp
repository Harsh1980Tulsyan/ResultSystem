<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql .*,java.io.*,com.resultsystem.dao.*,java.text.DecimalFormat" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Final Result</title>
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
String rollno=(String)s.getAttribute("rollno");
try{
	Connection c= new Dbcon().getConnection();
	PreparedStatement ps=c.prepareStatement("select * FROM ADD_STUDENT where ROLL_NO=?");
	ps.setString(1,rollno);
	ResultSet rs=ps.executeQuery();
	while(rs.next())
	{
	%>
	<h1 style="color:black;text-align:center">National Institute Of Technology Jamshedpur</h1>
	<div style="color:blue;text-align:center">
		<h2>Name:<%=rs.getString(1) %></h2>
		<h3>Roll No:<%=rs.getString(2) %></h3>
		<h4>Date of Birth:<%=rs.getString(3) %></h4>
		</div>	
<%
}
}
catch(Exception e)
{
	e.printStackTrace();
}
		
%>
<table align="center">
<tr>
<th>CourseCode</th>
<th>CourseName</th>
<th>TotalCredit</th>
<th>Test 1</th>
<th>Test 2</th>
<th>End Sem</th>
<th>Attendence</th>
<th>Quiz</th>
<th>Assignment</th>
<th>Grade</th>
</tr>
<%
int gradepoint=0,totalpoint=0;
float credit=0;
String[] coursecode={"EC501","EC502","EC503","EC504","EC505"};

for(int i=0;i<coursecode.length;i++)
{

try {
	Connection c=new Dbcon().getConnection();
	PreparedStatement ps=c.prepareStatement("select * FROM "+ coursecode[i ]+" where roll_no=?");
	PreparedStatement ps1=c.prepareStatement("select * FROM ADD_SUBJECT where COURSE_CODE=?");
	ps1.setString(1,coursecode[i]);
	ps.setString(1,rollno);
	ResultSet rs=ps.executeQuery();
	ResultSet rs1=ps1.executeQuery();
	%>
	<tr>
	<%
	
	while(rs1.next())
	{
		credit+=rs1.getInt(3);
		gradepoint=rs1.getInt(3);
	%>
	

<th><%=rs1.getString(1) %></th>
<th><%=rs1.getString(2) %></th>
<th><%=rs1.getString(3) %></th>
<%
}
%>
<% 
while(rs.next())
	{
	
	if(rs.getString(9).equals("O"))
	{
		totalpoint+=(10)*gradepoint;
	}
	else if(rs.getString(9).equals("A"))
	{
		totalpoint+=(9)*gradepoint;
	}
	else if(rs.getString(9).equals("B"))
	{
		totalpoint+=(8)*gradepoint;
	}
	else if(rs.getString(9).equals("C"))
	{
		totalpoint+=(7)*gradepoint;
	}
	else if(rs.getString(9).equals("D"))
	{
		totalpoint+=(6)*gradepoint;
	}
	else if(rs.getString(9).equals("E"))
	{
		totalpoint+=(5)*gradepoint;
	}
	
		%>
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
}
DecimalFormat df2 = new DecimalFormat(".##");
float cgpa=(totalpoint/credit);
%>
</table>
<h3 style="color:blue;text-align:center">CGPA:<%=df2.format(cgpa)%></h3>
</body>
</html>