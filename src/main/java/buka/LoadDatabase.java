package buka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import model.ServiceProvider;

@Configuration
public class LoadDatabase {
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	
	@Bean
	  CommandLineRunner initDatabase(BukaRepository repository) {

	    return args -> {
	      log.info("Preloading " + repository.save(new ServiceProvider("ok", "mail@mail", 80922993)) );
	    };
	  }
}
