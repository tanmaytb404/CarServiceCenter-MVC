<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>This is the attendant page</h1>
	<div>
		attendant name:
		<%=request.getAttribute("name")%></div>
	<h1>
		Speciality
		<%=request.getAttribute("speciality")%></h1>
</body>
</html>