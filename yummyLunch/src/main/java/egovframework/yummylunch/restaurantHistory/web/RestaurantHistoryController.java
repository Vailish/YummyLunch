package egovframework.yummylunch.restaurantHistory.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/history")
@Controller
public class RestaurantHistoryController {
	@GetMapping
	public void getHistoryList() {
		return;
	}
}
