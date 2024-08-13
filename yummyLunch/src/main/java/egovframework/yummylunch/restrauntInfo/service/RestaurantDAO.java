package egovframework.yummylunch.restrauntInfo.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.egovframe.rte.psl.dataaccess.EgovAbstractMapper;
import org.springframework.stereotype.Repository;

@Repository
public class RestaurantDAO extends EgovAbstractMapper {
	
	public List<RestaurantVO> selectRestrauntList() throws SQLException {
		return selectList("RestaurantDAO.selectRestrauntList");
	}
	
	public int insertRestraunt(String ㅇㅅㅇ) throws SQLException, IOException{
		return insert("RestaurantDAO.insertRestraunt", ㅇㅅㅇ);
	}
}
