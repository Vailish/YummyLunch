package egovframework.yummylunch.restaurantInfo.web;

import java.sql.SQLException;

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

@RequestMapping("/restaurant")
@Controller
public class RestaurantInfoController {

	@Resource
	RestaurantInfoService restaurantInfoService;

	@GetMapping
	public String getRestaurantList(ModelMap model) throws SQLException {
		System.out.println("getRestaurantList 요청들어옴");
		model.addAttribute("restaurantList", restaurantInfoService.selectRestaurantList());
		System.out.println("요청완료");
		return "contents/restaurantList";
	}

	@GetMapping("/{restaurant_id}")
	public void getRestaurant(@PathVariable long restaurant_id) {
		return;
	}

	@GetMapping("/insert")
	public void insertRestaurantPage() {
		return;
	}

	@PostMapping
	public void insertRestaurant() {
		return;
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
