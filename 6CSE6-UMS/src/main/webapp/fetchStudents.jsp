<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="javax.servlet.*" %>
<%@ page import="java.sql.*" %>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fetch Students</title>
</head>
<body>
<center>
<% out.println("<h2>Students Fetched</h2>");%>
<%
try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection c=DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/6cse6","root","sunil");
	String sql="select * from student";
	PreparedStatement p=c.prepareStatement(sql);
    ResultSet rs=p.executeQuery();
    %>
    <table border=1 bgcolor="yellow">
    <tr><td>
    <% out.println("<h3>ID</h3>");%>
    </td>
    <td>
    <% out.println("<h3>NAME</h3>");%>
    </td>
    <td>
    <% out.println("<h3>CGPA</h3>");%>
    </td>
    </tr>
    <%while(rs.next()) { %>
      <tr>
    	<td><%out.print("<h3>"+rs.getString(1)+"</h3>");%></td>
    	<td><%out.print("<h3>"+rs.getString(2)+"</h3>");%></td>
    	<td><%out.print("<h3>"+rs.getDouble(3)+"</h3>");%></td>
    	</tr>
    <%}%>
    </table>
<%}catch(Exception e) {
	System.out.println(e);
}

%>
</center>
</body>
</html>