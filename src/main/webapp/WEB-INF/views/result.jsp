<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <p>結果画面</p>
  ${fn:escapeXml(msg)}
  <p>商品:${fn:escapeXml(product.name)}</p>
  <p>金額:${fn:escapeXml(product.price)}</p>
  <a href="index">戻る</a>
</body>
</html>