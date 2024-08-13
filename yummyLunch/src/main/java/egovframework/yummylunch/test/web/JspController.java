package egovframework.yummylunch.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/jsp")
@Controller
public class JspController {

	@RequestMapping("/cnn")
	public String jspTest() {
		System.out.println("jsp request is arrived");
		return "test";
	}

}
