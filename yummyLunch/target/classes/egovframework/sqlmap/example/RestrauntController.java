package egovframework.yummylunch.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/restraunt")
@Controller
public class RestrauntController {
	@GetMapping
	public void getRestrauntList() {
		return;
	}
	@GetMapping("/{restraunt_id}")
	public void getRestraunt(@PathVariable long restraunt_id) {
		return;
	}
	@GetMapping("/insert")
	public void insertRestrauntPage() {
		return;
	}
	@PostMapping
	public void insertRestraunt() {
		return;
	}
	@GetMapping("update")
	public void updateRestrauntPage() {
		return;
	}
	@PutMapping
	public void updateRestraunt() {
		return;
	}
	@DeleteMapping
	public void deleteRestraunt() {
		return;
	}
}
