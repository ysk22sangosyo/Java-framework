<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>検索結果を入力してください</h1>
${error}<br>
<form:form action ="search" modelAttribute="product" method ="post">
<div>
product_id:<form:input path="productId"/>
</div>
<form:button name="search">検索</form:button>
</form:form>
</body>
</html>