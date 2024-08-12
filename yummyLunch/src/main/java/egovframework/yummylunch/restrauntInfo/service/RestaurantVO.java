package egovframework.yummylunch.service;

public class RestaurantVO {
	private String restaurantId;
	private String restaurantName;
	private String restaurantEtc;
	private String createdAt;
	private String updatedAt;

	public String getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(String restaurantId) {
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
