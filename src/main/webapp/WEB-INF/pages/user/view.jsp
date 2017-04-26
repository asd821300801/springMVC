<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看用户</title>
</head>
<body>
	ID:${user.id }
	<br> 帐号： ${user.name }
	<br> 性别：${user.sex }

	<br />

	<%-- <c:forEach var="name" items="${msg}">
    	错误信息：<c:out value="${name}" /> <br />
	</c:forEach> --%>
	<c:forEach var="item" items="${msg}">
    	错误信息： <c:out value="${item.defaultMessage}" /> <br />
    	
	</c:forEach>
	<br /><br />
	<spring:message code="login" arguments="name" argumentSeparator=","/>
	
</body>
</html>