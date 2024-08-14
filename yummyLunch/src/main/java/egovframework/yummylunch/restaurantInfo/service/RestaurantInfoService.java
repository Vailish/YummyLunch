package egovframework.yummylunch.restaurantInfo.service;

import java.sql.SQLException;
import java.util.List;

public interface RestaurantInfoService {
//	Rest
	public List<RestaurantInfoVO> selectRestaurantList() throws SQLException;
	
	public int insertRestaurant(RestaurantInfoVO restaurantInfoVO) throws SQLException;
}
