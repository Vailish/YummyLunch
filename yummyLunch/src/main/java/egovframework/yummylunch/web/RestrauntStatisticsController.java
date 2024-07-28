package egovframework.yummylunch.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/statistic")
@Controller
public class RestrauntStatisticsController {
	@GetMapping
	public void getStatisticList() {
		return;
	}
}
