<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
<h2 align="center">Bugs Information</h2>
<form method="get" action="ShowAllBugs">
<input type="submit" value="Show All Bugs"><br>
</form> <br>

<table>
<thead>
<tr>
<th>Project Id</th>
<th>Project Name</th>
<th>Email</th>
<th>Owner</th>
<th>Priority</th>
<th>Status</th>
<th>Owner Project</th>
<th>Created Date</th>
<th>completion Date</th>
<th>Description</th>
<th>Attached files</th>
</tr>
</thead>
<tbody>
<c:forEach items="${bugs}" var="bug">
<tr>
		  <td><c:out value="${bug.getProjectId()}"></c:out></td>
		  <td><c:out value="${bug.getProjectName()}"></c:out></td>
		  <td><c:out value="${bug.getEmail()}"></c:out></td>
		  <td><c:out value="${bug.getOwner()}"></c:out></td>
		  <td><c:out value="${bug.getPriority()}"></c:out></td>
		  <td><c:out value="${bug.getStatus()}"></c:out></td>
		  <td><c:out value="${bug.getOwnerProject()}"></c:out></td>
		  <td><c:out value="${bug.getCreatedDate()}"></c:out></td>
		  <td><c:out value="${bug.getCompletionDate()}"></c:out></td>
		  <td><c:out value="${bug.getDescription()}"></c:out></td>
		  <td><c:out value="${bug.getAttachedFiles()}"></c:out></td>
</tr>  
		</c:forEach>
</tbody>
</table>

</body>
</html>