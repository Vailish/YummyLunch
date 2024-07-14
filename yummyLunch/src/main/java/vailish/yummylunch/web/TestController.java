package vailish.yummylunch.web;

<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

	@RequestMapping("/cnn")
	public String cnnTest() {
		System.out.println("cnn request is arrived");
		return "yummyLunch is running";
=======
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
>>>>>>> 834631c4e7720a179e175f7aea41e73a3fbb4044
	}
}
