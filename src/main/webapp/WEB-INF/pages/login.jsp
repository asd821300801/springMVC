<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="http://www.springframework.org/tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="login?lang=zh">中文</a> | <a href="login?lang=en">英文</a>
	<form action="">
		<s:message code="account"></s:message><input type="text" /><br />
		<s:message code="password"></s:message><input type="text" /><br />
		<button type="submit"><s:message code="login"></s:message></button>
	</form>
</body>
</html>