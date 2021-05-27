package buka;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import buka.model.ServiceProvider;
import buka.repository.BukaRepository;
import buka.repository.ServiceProviderRepository;

@RestController
public class BukaController {
	private final BukaRepository repository;
	private final ServiceProviderRepository sprepository;

	public BukaController(BukaRepository repository, ServiceProviderRepository sprepository) {
		this.repository = repository;
		this.sprepository = sprepository;
	}
	
	@GetMapping("/bukas")
	List<ServiceProvider> all() { 
		return sprepository.findAll();
	}
}
