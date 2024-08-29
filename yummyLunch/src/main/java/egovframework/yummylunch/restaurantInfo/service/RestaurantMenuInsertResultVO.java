package egovframework.yummylunch.restaurantInfo.service;

public class RestaurantMenuInsertResultVO {
	private int numberOfRestaurant;
	private int numberOfMenu;
	private int numberOfRestaurantMenu;
	
	public int getNumberOfRestaurant() {
		return numberOfRestaurant;
	}
	public void setNumberOfRestaurant(int numberOfRestaurant) {
		this.numberOfRestaurant = numberOfRestaurant;
	}
	public int getNumberOfMenu() {
		return numberOfMenu;
	}
	public void setNumberOfMenu(int numberOfMenu) {
		this.numberOfMenu = numberOfMenu;
	}
	public int getNumberOfRestaurantMenu() {
		return numberOfRestaurantMenu;
	}
	public void setNumberOfRestaurantMenu(int numberOfRestaurantMenu) {
		this.numberOfRestaurantMenu = numberOfRestaurantMenu;
	}
	
	public boolean chkResult() {
		if (numberOfRestaurant == 1 && numberOfRestaurantMenu > 0 && numberOfMenu == numberOfRestaurantMenu) return true;
		return false;
	}
}
