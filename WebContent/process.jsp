<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.sohan.dto.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Success</title>
</head>
<body>
	<h3>Login successful!!</h3>
	
	<jsp:useBean id="user" class="com.sohan.dto.User" scope="request">
		<jsp:setProperty property="*" name="user" />
	</jsp:useBean>

	UserId: <jsp:getProperty property="userId" name="user"/><br>
	UserName: <jsp:getProperty property="userName" name="user"/>
</body>
</html>