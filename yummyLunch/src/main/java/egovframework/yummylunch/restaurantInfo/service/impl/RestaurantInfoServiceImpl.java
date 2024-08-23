package egovframework.yummylunch.restaurantInfo.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import egovframework.yummylunch.restaurantInfo.service.MenuInsertVO;
import egovframework.yummylunch.restaurantInfo.service.RestaurantInfoService;
import egovframework.yummylunch.restaurantInfo.service.RestaurantInfoVO;
import egovframework.yummylunch.restaurantInfo.service.RestaurantInsertVO;
import egovframework.yummylunch.restaurantInfo.service.RestaurantMenuInsertResultVO;
import egovframework.yummylunch.restaurantInfo.service.RestaurantMenuInsertVO;

@Service
public class RestaurantInfoServiceImpl implements RestaurantInfoService{
	
	@Resource
	RestaurantInfoDAO restaurantInfoDAO;
	
	@Override
	public List<RestaurantInfoVO> selectRestaurantList() throws SQLException {
		return restaurantInfoDAO.selectRestaurantList();
	}

	@Override
	public int insertRestaurant(RestaurantInfoVO restaurantInfoVO) throws SQLException, IOException {
		// TODO Auto-generated method stub
		return restaurantInfoDAO.insertRestaurant(restaurantInfoVO);
	}

	@Override
	public int insertMenu(MenuInsertVO menuInsertVO) throws SQLException, IOException {
		// TODO Auto-generated method stub
		return restaurantInfoDAO.insertMenu(menuInsertVO);
	}

	@Override
	@Transactional
	public RestaurantMenuInsertResultVO insertRestaurantMenu(RestaurantInsertVO restaurantInsertVO) throws SQLException, IOException {
		RestaurantMenuInsertResultVO result = new RestaurantMenuInsertResultVO();
		int resultMenu = 0;
		int resultTable = 0;
		
		RestaurantInfoVO restaurantInfoVO = new RestaurantInfoVO();
		restaurantInfoVO.setRestaurantName(restaurantInsertVO.getRestaurantName());
		
		// restaurant 등록
		result.setNumberOfRestaurant(insertRestaurant(restaurantInfoVO));

		// 관계 테이블 restaurantId 등록
		RestaurantMenuInsertVO restaurantMenuInsertVO = new RestaurantMenuInsertVO();
		restaurantMenuInsertVO.setRestaurantId(restaurantInfoVO.getRestaurantId());

		// menu 등록 및 관계 테이블 등록
		for (MenuInsertVO menuInsertVO : restaurantInsertVO.getMenus()) {
			resultMenu += insertMenu(menuInsertVO);
			
			// 관계 테이블 등록
			restaurantMenuInsertVO.setMenuId(menuInsertVO.getMenuId());
			resultTable += restaurantInfoDAO.insertRestaurantMenu(restaurantMenuInsertVO);
		}
		result.setNumberOfMenu(resultMenu);
		result.setNumberOfRestaurantMenu(resultTable);
		
		// 관계 넣어줘야함
		return result;
	}

}
