package egovframework.yummylunch.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/drawRestraunt")
@Controller
public class DrawRestrauntController {
	@GetMapping
	public void drawRestrauntMain(){
		return;
	}
	
	@GetMapping("/draw")
	public void drawRestraunt(){
		return;
	}
	
	@PostMapping("/draw")
	public void chooseDrawRestraunt(){
		return;
	}
}
