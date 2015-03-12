<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student List</title>
<script type="text/javascript" src='<c:url value="/resources/js/jquery-1.10.1.min.js"></c:url>' ></script>
<script type="text/javascript" src='<c:url value="/resources/js/studentList.js"></c:url>' ></script>
</head>
<body>
	<form id = "frmstudent">
		<p>ID:</p>
		<input type="text" id= "txtid" name = "studentId"/>
		<p>Name:</p>
		<input type="text" id = "txtname" name = "studentName"/>
		<br/>
		<input type= "button" value="SEARCH" id="btSearch"/>
		<input type= "button" value="ADD" id="btAdd"/>
		<input type= "button" value="UPDATE" id="btUpdate"/>
		<input type= "button" value="DELETE" id="btDelete"/>
	</form>

	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
		</tr>
		<tbody id="lstStudents">
		</tbody>
	</table>
	<p id="txtText">
	</p>
</body>
</html>