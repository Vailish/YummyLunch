package egovframework.yummylunch.restaurantInfo.web;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.yummylunch.restaurantInfo.service.RestaurantInfoService;
import egovframework.yummylunch.restaurantInfo.service.RestaurantInfoVO;

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
	public String insertRestaurant() {
		System.out.println("insert 요청 들어옴");
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
