<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>YummyLunch</title>
<link rel="stylesheet" href="<c:url value='/css/basic.css'/>">
<%-- <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/basic.css"> --%>
</head>
<body>
<div class="flex-container">
	<div class="flex-item">
		<h1>식당목록보기</h1>
	</div>
</div>
<div>
	<div class="flex-container">
		<div class="flex-item-title">식당이름</div>
		<div class="flex-item-title">대표메뉴</div>
	</div>
	<c:forEach var="restaurant" items="${restaurantList}" varStatus="status">
		<div class="flex-container">
			<div class="flex-item">${restaurant.restaurantName}</div>
			<div class="flex-item">${restaurant.menuName}</div>
		</div>
	</c:forEach>
</div>
</body>
</html>