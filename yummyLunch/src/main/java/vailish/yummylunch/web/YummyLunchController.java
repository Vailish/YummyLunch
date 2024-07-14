package vailish.yummylunch.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class YummyLunchController {
	@GetMapping("/test")
	public String getMainPage() {
		System.out.println("요청 들어왔습니다~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		return "contents/main";
	}
}
