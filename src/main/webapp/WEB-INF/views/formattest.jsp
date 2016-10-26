<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="spring"  uri="http://www.springframework.org/tags"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 根据jsp内置对象从attribute中取数据（以对象的形式） -->
	money:<br/>
	<spring:eval expression="contentModel.money"></spring:eval><br/>
	date:<br/>
	<spring:eval expression="contentModel.date"></spring:eval><br/>
	
</body>
</html>