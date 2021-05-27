package buka;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BukaController {
	private final BukaRepository repository;

	public BukaController(BukaRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/bukas")
	List<ServiceProvider> all() { 
		return repository.findAll();
	}
}
