package egovframework.yummylunch.restaurantDraw.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/drawRestaurant")
@Controller
public class DrawRestaurantController {
	@GetMapping
	public void drawRestaurantMain(){
		return;
	}
	
	@GetMapping("/draw")
	public void drawRestaurant(){
		return;
	}
	
	@PostMapping("/draw")
	public void chooseDrawRestaurant(){
		return;
	}
}
