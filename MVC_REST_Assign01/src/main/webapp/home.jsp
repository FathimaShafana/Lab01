<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add or Get Employee</title>
</head>
<body>
<label><b>Add User</b></label>
<p>
<form action="addEmployee">
		Employee ID: <input type="text" name="empid"> <br>
		Name: <input type="text" name="name"> <br>
		Address: <input type="text" name="address"> <br>
		Salary: <input type="text" name="salary"> <br>
		Value: <input type="text" name="value"><br>
		Position:<input type="radio" name = "position" value = 1> 1
				<input type="radio" name = "position" value = 2> 2
				<input type="radio" name = "position" value = 3> 3
				<input type="radio" name = "position" value = 4> 4<br>
 		Gender: <input type="radio" name="gender" value= Male> Male  
  				<input type="radio" name="gender" value=Female> Female <br>  
<input type="Submit">
</form>
</p>

<p>
<label> <b>Get Employee with corresponding Employee ID </b></label>
<form action="getEmployee">
ID: <input type="text" name="empid"> <br>
<input type="Submit">
</form>
</p>

<p>
<label> <b>All Employees </b></label>
<form action="/AllEmployee.jsp">
<input type="submit" value="View All">
</form>
</p>
</body>
</html>