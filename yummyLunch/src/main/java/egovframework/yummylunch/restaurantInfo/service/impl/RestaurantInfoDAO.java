package egovframework.yummylunch.restaurantInfo.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.egovframe.rte.psl.dataaccess.EgovAbstractMapper;
import org.springframework.stereotype.Repository;

import egovframework.yummylunch.restaurantInfo.service.MenuInsertVO;
import egovframework.yummylunch.restaurantInfo.service.RestaurantInfoVO;
import egovframework.yummylunch.restaurantInfo.service.RestaurantMenuInsertVO;

@Repository
public class RestaurantInfoDAO extends EgovAbstractMapper {
	
	public List<RestaurantInfoVO> selectRestaurantList() throws SQLException {
		return selectList("RestaurantDAO.selectRestaurantList");
	}
	
	public RestaurantInfoVO selectRestaurant(RestaurantInfoVO restaurantVO) throws SQLException, IOException {
		return selectOne("RestaurantDAO.selectRestaurant", restaurantVO);
	}
	
	public int insertRestaurant(RestaurantInfoVO restaurantVO) throws SQLException, IOException{
		return insert("RestaurantDAO.insertRestaurant", restaurantVO);
	}
	
	public int insertMenu(MenuInsertVO menuInsertVO) throws SQLException, IOException {
		return insert("RestaurantDAO.insertMenu", menuInsertVO);
	}
	
	public int insertRestaurantMenu(RestaurantMenuInsertVO restaurantMenuInsertVO) throws SQLException, IOException {
		return insert("RestaurantDAO.insertRestaurantMenu", restaurantMenuInsertVO);
	}
}
