package egovframework.yummylunch.restaurantInfo.service.impl;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.yummylunch.restaurantInfo.service.RestaurantInfoService;
import egovframework.yummylunch.restaurantInfo.service.RestaurantInfoVO;

@Service
public class RestaurantInfoServiceImpl implements RestaurantInfoService{
	
	@Resource
	RestaurantInfoDAO restaurantInfoDAO;
	
	@Override
	public List<RestaurantInfoVO> selectRestaurantList() throws SQLException {
		return restaurantInfoDAO.selectRestaurantList();
	}

	@Override
	public int insertRestaurant(RestaurantInfoVO restaurantInfoVO) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
