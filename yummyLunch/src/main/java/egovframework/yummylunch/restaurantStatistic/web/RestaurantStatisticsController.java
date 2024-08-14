package egovframework.yummylunch.restaurantStatistic.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/statistic")
@Controller
public class RestaurantStatisticsController {
	@GetMapping
	public void getStatisticList() {
		return;
	}
}
