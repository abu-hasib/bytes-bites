package buka;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import buka.model.City;
import buka.model.Meal;
import buka.model.ServiceProvider;
import buka.repository.CityRepository;
import buka.repository.ServiceProviderRepository;

@SpringBootApplication
public class BukaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(BukaApplication.class,
				args);
ServiceProviderRepository serviceProviderRespository = configurableApplicationContext
				.getBean(ServiceProviderRepository.class);
CityRepository cityRepository = configurableApplicationContext
				.getBean(CityRepository.class);

		City city = new City("Lagos");
		ServiceProvider provider = new ServiceProvider("Fingers", "mail@mail.org", 399399394, city);
		List<ServiceProvider> serviceProviders = Arrays.asList(provider);
		city.setServiceProviders(serviceProviders);
		cityRepository.save(city);
		Meal rice = new Meal(20, "food", 15, provider);
		Meal efo = new Meal(20, "good food", 10, provider);
		List<Meal> meals = Arrays.asList(rice, efo);
		provider.setMeals(meals);
		serviceProviderRespository.save(provider);
	}

}
