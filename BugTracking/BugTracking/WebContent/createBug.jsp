<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center">
<h2>Create Bug</h2>
<form method="post"  action="CreateBug">

<label for=projectId>Project Id</label>
<input type="number" name="projectId" required="required"><br>


<label for="projectName">Project Name</label>
<input type="text" name="projectName" required="required"><br>

<label for="email">Email</label>
<input type="email" name="email" required="required"><br>

<label for="owner">Owner</label>
<input type="text" name="owner" required="required"><br>

<label for="priority">Priority</label>
<input type="text" name="priority" required="required"><br>

<label for="status">Bug Status</label>
<select name="status" id="status" required="required">
  <option value="open">open</option>
  <option value="resolved">resolved</option>
  <option value="closed">closed</option>
</select><br>

<label for="ownerProject">OwnerProject</label>
<input type="text" name="ownerProject" required="required"><br>

<label for="createdDate">CreatedDate</label>
<input type="date" name="createdDate" required="required"><br>

<label for="completionDate">CompletionDate</label>
<input type="date" name="completionDate" required="required"><br>

<label for="description">Description</label>
<input type="text" name="description" required="required"><br>

<label for="attachedFiles">AttachedFiles</label>
<input type="file" name="attachedFiles" required="required"><br>

<input type="submit" value = "create">
</form>
</body>
</html>