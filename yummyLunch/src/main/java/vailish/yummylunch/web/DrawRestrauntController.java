package vailish.yummylunch.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/drawRestraunt")
@Controller
public class DrawRestrauntController {
	@GetMapping
	static void drawRestrauntMain(){
		return;
	}
	
	@GetMapping("/draw")
	static void drawRestraunt(){
		return;
	}
	
	@PostMapping("/draw")
	static void chooseDrawRestraunt(){
		return;
	}
}
