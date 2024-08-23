package egovframework.yummylunch.restaurantInfo.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface RestaurantInfoService {

	public List<RestaurantInfoVO> selectRestaurantList() throws SQLException;
	
	public int insertRestaurant(RestaurantInfoVO restaurantInfoVO) throws SQLException, IOException;
	
	public int insertMenu(MenuInsertVO menuInsertVO) throws SQLException, IOException;
	
	public RestaurantMenuInsertResultVO insertRestaurantMenu(RestaurantInsertVO restaurantInsertVO) throws SQLException, IOException;
}
