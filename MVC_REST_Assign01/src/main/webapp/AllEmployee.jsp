<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post">

<table border="2">
<tr>
<td>ID</td>
<td>NAME</td>
<td>ADDRESS</td>
<td>POSITION</td>
<td>GENDER</td>
</tr>
</body>
</html>
<% 
import java.sql.Connection;  
import java.sql.DriverManager;

try
{
Class.forName("org.h2.driver");
String url="jdbc:h2:mem:db1";
String username="sa";
String password="";
String query="select * from Employee";
Connection con=DriverManager.getConnection(url,username,password);
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery(query);

while(rs.next())
{

%>
    <tr><td><%rs.getInt("empid"); %></td></tr>
    <tr><td><%rs.getString("name"); %></td></tr>
    <tr><td><%rs.getString("address"); %></td></tr>
    <tr><td><%rs.getInt("position"); %></td></tr>
    <tr><td><%rs.getString("gender"); %></td></tr>
        <%

}
%>
    </table>
    <%
    rs.close();
    stmt.close();
    conn.close();
    }
catch(Exception e)
{
    e.printStackTrace();
    }

%>	
