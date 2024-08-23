package egovframework.yummylunch.restaurantInfo.service;

public class MenuInsertVO {
	private int menuId;
	private String menuName;
	private int menuPrice;
	private String menuEtc;
	private boolean isMain;
	
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getMenuPrice() {
		return menuPrice;
	}
	public void setMenuPrice(int menuPrice) {
		this.menuPrice = menuPrice;
	}
	public String getMenuEtc() {
		return menuEtc;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuEtc(String menuEtc) {
		this.menuEtc = menuEtc;
	}
	public boolean getIsMain() {
		return isMain;
	}
	public void setIsMain(boolean isMain) {
		this.isMain = isMain;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
}
