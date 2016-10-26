<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 文件上传必须用form表单且enctype="multipart/form-data"必须强制，method必须为post-->
	<form action="parambind?urlParam=AAA" method="post" enctype="multipart/form-data"> 
		<input type="text" name="formParam" /><br/> 
		<input type="file" name="formFile" /><br/>
		<input type="submit" value="Submit" />
	</form>  
</body>
</html>