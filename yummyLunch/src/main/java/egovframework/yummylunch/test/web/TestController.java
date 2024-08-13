package egovframework.yummylunch.test.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

	@RequestMapping("/cnn")
	public String cnnTest() {
		System.out.println("cnn request is arrived");
		return "yummyLunch is running";
	}
	
	@RequestMapping("/nb")
	public String nb() {
		System.out.println("nb is arrived");
		return "yummyLunch is running";
	}
}
