<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="user" method="post">
	<input type="text" name="name"/>
	<input type="text" name="id"/>
	<input type="text" name="sex"/>
	<input type="submit" value="新增"/>
</form>

<form action="11" method="post">
	<input type="hidden" name="_method" value="DELETE"/>
	<input type="submit" value="删除"/>
</form>

<form action="11" method="post">
	<input type="hidden" name="_method" value="PUT"/>
	<input type="submit" value="修改"/>
</form>


<form action="11" method="get">
	
	<input type="submit" value="查询"/>
</form>

</body>
</html>