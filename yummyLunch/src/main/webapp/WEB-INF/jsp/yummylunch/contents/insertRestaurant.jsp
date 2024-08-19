<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>YummyLunch</title>
<style>
.flex-container {
    display: flex; /* Flex 컨테이너로 설정 */
    justify-content: space-around; /* 아이템 사이의 공간을 균등하게 분배 */
    align-items: center; /* 아이템들을 수직으로 중앙 정렬 */
}
.flex-item-title-left {
    padding: 10px;
    text-align: right;
    flex: 1; /* Flex 아이템의 크기를 균등하게 설정 */
    font-weight: bold;
    
}
.flex-item-title {
    padding: 10px;
    text-align: center;
    flex: 1; /* Flex 아이템의 크기를 균등하게 설정 */
    font-weight: bold;
}
.flex-item-title-right {
    padding: 10px;
    text-align: left;
    flex: 1; /* Flex 아이템의 크기를 균등하게 설정 */
    font-weight: bold;
}
.flex-item {
    padding: 10px;
    text-align: center;
    flex: 1; /* Flex 아이템의 크기를 균등하게 설정 */
}
.flex-container-button {
    display: flex; /* Flex 컨테이너로 설정 */
    justify-content: flex-end;
    padding: 10px;
}
.button {
    padding: 10px;
    text-align: center;
    flex: 1; /* Flex 아이템의 크기를 균등하게 설정 */
    font-weight: bold;
}
</style>
</head>
<body>
<div class="flex-container">
	<div class="flex-item">
		<h1>식당등록하기</h1>
	</div>
</div>
<div>
	<form action="insert" method="POST">
		<div class="flex-container">
			<div class="flex-item-title-left">식당이름 : </div>
			<div class="flex-item-title">
				<input type="text" name="restaurantName">
			</div>
			<div class="flex-item-title-right"></div>
		</div>
		<div class="flex-container">
			<div class="flex-item-title-left">대표메뉴</div>
			<div class="flex-item-title">메뉴</div>
			<div class="flex-item-title-right">가격</div>
		</div>
		<div class="flex-container">
			<div class="flex-item-title-left">
				<input type="radio" name="isMain">
			</div>
			<div class="flex-item-title">
				<input type="text" name="menuName">
			</div>
			<div class="flex-item-title-right">
				<input type="text" name="menuPrice">
			</div>
		</div>
		<div class="flex-container">
			<div class="flex-item-title-left"></div>
			<div class="flex-item-title">메뉴추가하기</div>
			<div class="flex-item-title-right"></div>
		</div>
		<div class="flex-container-button">
			<button class="button-right">등록하기</button>
			<span> / </span>
			<button class="button-right">취소하기</button>
		</div>
	</form>
</div>
</body>
</html>