package egovframework.yummylunch.restaurantInfo.service;

import java.util.List;

public class RestaurantInsertVO {
	private int restaurantId;
	private String restaurantName;
	private List<MenuInsertVO> menus;
	
	public String getRestaurantName() {
		return restaurantName;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public List<MenuInsertVO> getMenus() {
		return menus;
	}
	public void setMenus(List<MenuInsertVO> menus) {
		this.menus = menus;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
}
