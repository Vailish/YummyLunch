package vailish.yummylunch.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("test")
@RestController
public class TestController {
	@GetMapping
	public ResponseEntity<String> cnnCheck() { 
		return new ResponseEntity<String>("connected", HttpStatus.OK);
	}
}
