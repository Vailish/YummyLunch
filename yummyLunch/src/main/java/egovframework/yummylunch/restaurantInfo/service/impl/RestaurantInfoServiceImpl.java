package egovframework.yummylunch.restaurantInfo.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import egovframework.yummylunch.restaurantInfo.service.RestaurantInfoService;
import egovframework.yummylunch.restaurantInfo.service.RestaurantInfoVO;

@Service
public class RestaurantInfoServiceImpl implements RestaurantInfoService{

	RestaurantInfoDAO restaurantInfoDAO;
	
	@Override
	public List<RestaurantInfoVO> selectRestaurantList() throws SQLException {
		System.out.println(this.getClass() + " in");
		List<RestaurantInfoVO> restaurantInfoVOs = restaurantInfoDAO.selectRestaurantList();
		System.out.println(this.getClass() + " out");
		return restaurantInfoVOs;
	}

	@Override
	public int insertRestaurant(RestaurantInfoVO restaurantInfoVO) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
