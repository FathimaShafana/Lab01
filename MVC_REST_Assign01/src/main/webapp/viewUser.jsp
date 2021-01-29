<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
</head>
<body>

	<sql:setDataSource
        var="employee"
        driver="org.h2.driver"
        url="jdbc:h2:mem:db1"
        user="sa" password=""
    />
   
    <c:forEach items="${empid}" var="employee">
            <c:choose>
                <c:when "${employee.netValue le 0}">
                    <tr style="background-color: red;">
                        <td><c:out value="${employee.name}"/></td>
                        <td><c:out value="${employee.netValue}"/></td>  
                    </tr>
                </c:when>
                <c:otherwise>
                    <tr>
                        <td><c:out value="${employee.name}"/></td>
                        <td><c:out value="${employee.netValue}"/></td>  
                    </tr>
                </c:otherwise>
            </c:choose>
        </c:forEach> 
 
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of users</h2></caption>
            <tr>
                <th>Employee ID</th>
                <th>Name</th>
                <th>Address</th>
                <th>Salary</th>
                <th>Value</th>
                <th>Position</th>
                <th>Gender</th>
                <th>Net Value </th>
            </tr>
            
                <tr>
                    <td>${employee.empid}</td>
                    <td>${employee.name}</td>
                    <td>${employee.address}</td>
                    <td>${employee.salary}</td>
                    <td>${employee.value}</td>
                    <td>${employee.position}</td>
                    <td>${employee.gender}</td>
                    
                </tr>
           
        </table>
    </div>

</body>
</html>