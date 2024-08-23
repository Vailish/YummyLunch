package egovframework.yummylunch.restaurantInfo.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import egovframework.yummylunch.restaurantInfo.service.MenuInsertVO;
import egovframework.yummylunch.restaurantInfo.service.RestaurantInfoService;
import egovframework.yummylunch.restaurantInfo.service.RestaurantInfoVO;
import egovframework.yummylunch.restaurantInfo.service.RestaurantInsertVO;

@RequestMapping("/restaurant")
@Controller
public class RestaurantInfoController {

	@Resource
	RestaurantInfoService restaurantInfoService;

	@GetMapping
	public String getRestaurantList(ModelMap model) throws SQLException {
		List<RestaurantInfoVO> lst = restaurantInfoService.selectRestaurantList();
		model.addAttribute("restaurantList", lst);
		return "contents/restaurantList";
	}

	@GetMapping("/{restaurant_id}")
	public void getRestaurant(@PathVariable long restaurant_id) {
		return;
	}

	@GetMapping("/insert")
	public String insertRestaurantPage() {
		System.out.println("insertRestaurantPage 요청");
		return "contents/insertRestaurant";
	}

	@PostMapping("/insert")
	public String insertRestaurant(@ModelAttribute RestaurantInsertVO restaurantInsertVO) throws SQLException, IOException {
		System.out.println("insert 요청 들어옴");
		System.out.println(
				restaurantInsertVO.getRestaurantName()
				);
		for (MenuInsertVO menuInsertVO : restaurantInsertVO.getMenus()) {
			System.out.println(menuInsertVO.getMenuName() + " " + menuInsertVO.getMenuPrice() + " " + menuInsertVO.getIsMain() + " " + menuInsertVO.getMenuEtc());
		}
		int result = restaurantInfoService.insertRestaurantMenu(restaurantInsertVO);
		
		if (result == 0) {
			System.out.println("입력실패입니다.");
		}
		
		
		return "contents/restaurantList";
	}

	@GetMapping("update")
	public void updateRestaurantPage() {
		return;
	}

	@PutMapping
	public void updateRestaurant() {
		return;
	}

	@DeleteMapping
	public void deleteRestaurant() {
		return;
	}
}
