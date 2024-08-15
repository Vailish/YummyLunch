package egovframework.yummylunch.main.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class YummyLunchController {
	@GetMapping
	public String getMainPage() {
		return "contents/main";
	}
}
