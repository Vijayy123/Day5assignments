<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">Update Bug</h2>
<form method="post" action="UpdateBug" required="required">

<label for=projectId>Project Id</label>
<input type="number" name="projectId" required="required"><br>

<label for="priority">Priority</label>
<input type="text" name="priority" required="required"><br>

<label for="status">Bug Status</label>
<select name="status" id="status" required="required">
  <option value="open">open</option>
  <option value="resolved">resolved</option>
  <option value="closed">closed</option>
</select><br>

<label for="description">Description</label>
<input type="text" name="description" required="required"><br>

<input type="submit" value = "update">

</form>
</body>
</html>