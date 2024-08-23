package egovframework.yummylunch.restaurantInfo.service;

public class RestaurantInfoVO {
	private int restaurantId;
	private String restaurantName;
	private String restaurantEtc;
	private String createdAt;
	private String updatedAt;

	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getRestaurantEtc() {
		return restaurantEtc;
	}
	public void setRestaurantEtc(String restaurantEtc) {
		this.restaurantEtc = restaurantEtc;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public String getUpdatedAt() {
		return updatedAt;
	}
}
