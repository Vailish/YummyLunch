<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>YummyLunch</title>
<link rel="stylesheet" href="/css/yummyLunch/basic.css">
<style>
.flex-container {
    display: flex; /* Flex 컨테이너로 설정 */
    justify-content: space-around; /* 아이템 사이의 공간을 균등하게 분배 */
    align-items: center; /* 아이템들을 수직으로 중앙 정렬 */
}
.flex-item-title {
    padding: 10px;
    text-align: center;
    flex: 1; /* Flex 아이템의 크기를 균등하게 설정 */
    font-weight: bold;
}
.flex-item {
    padding: 10px;
    text-align: center;
    flex: 1; /* Flex 아이템의 크기를 균등하게 설정 */
}
</style>
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