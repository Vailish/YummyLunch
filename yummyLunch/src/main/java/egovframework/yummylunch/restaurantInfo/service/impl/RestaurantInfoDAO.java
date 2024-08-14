package egovframework.yummylunch.restaurantInfo.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.egovframe.rte.psl.dataaccess.EgovAbstractMapper;
import org.springframework.stereotype.Repository;

import egovframework.yummylunch.restaurantInfo.service.RestaurantInfoVO;

@Repository
public class RestaurantInfoDAO extends EgovAbstractMapper {
	
	public List<RestaurantInfoVO> selectRestaurantList() throws SQLException {
		System.out.println("ㅇㅅㅇ");
		System.out.println(this.getClass() + " in");
		return selectList("RestaurantDAO.selectRestaurantList");
	}
	
	public int insertRestaurant(RestaurantInfoVO restaurantVO) throws SQLException, IOException{
		return insert("RestaurantDAO.insertRestaurant", restaurantVO);
	}
	
	public RestaurantInfoVO selectRestaurant(RestaurantInfoVO restaurantVO) throws SQLException, IOException {
		return selectOne("RestaurantDAO.selectRestaurant", restaurantVO);
	}
}
