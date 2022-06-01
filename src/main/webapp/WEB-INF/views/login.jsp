<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<form:form action ="login" modelAttribute="login" method ="post">
ログインID:<form:input path ="id" /><br>
パスワード:<form:password path ="pass" /><br>
<p>${error}</p>
 <form:button>送信</form:button>
</form:form>
</div>
<a href ="index">戻る</a>
</body>
</html>