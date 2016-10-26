<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>数据绑定</title>
</head>
<body>
    <h4>方法一：注解方式绑定实体对象</h4>
	<form action="<%=path%>/databind/modelautobind" method="post">
		用户名：<input type="text" name="username"><br/>
		密 码：<input type="password" name="password"><br/>
		<input type="submit" value="Submit" />
	</form>
	<hr>
	<h4>方法二：model.addAttribute绑定实体对象</h4>
	<form action="<%=path%>/databind/modelautobind2" method="post">
		用户名：<input type="text" name="username"><br/>
		密 码：<input type="password" name="password"><br/>
		<input type="submit" value="Submit" />
	</form>
	<hr>
	<h4>方法三：request.setAttribute绑定实体对象</h4>
	<form action="<%=path%>/databind/modelautobind3" method="post">
		用户名：<input type="text" name="username"><br/>
		密 码：<input type="password" name="password"><br/>
		<input type="submit" value="Submit" />
	</form>
	<hr>
	<h4>方法四：map.put("xxx","yyy")绑定实体对象</h4>
	<form action="<%=path%>/databind/modelautobind4" method="post">
		用户名：<input type="text" name="username"><br/>
		密 码：<input type="password" name="password"><br/>
		<input type="submit" value="Submit" />
	</form>
	<hr>
	<a href="<%=path%>/databind/modelautobind2?username=admin&password=123456">link</a>
</body>
</html>