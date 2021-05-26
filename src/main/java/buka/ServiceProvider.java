package buka;

import java.util.ArrayList;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

class ServiceProvider {
	private @Id @GeneratedValue Long id;
	private String name;
	private String email;
	private Long number;
	private City city;
	private ArrayList<Meal> meal;

	public ServiceProvider(Long id, String name, String email, Long number, City city, ArrayList<Meal> meal) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.number = number;
		this.city = city;
		this.meal = meal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public ArrayList<Meal> getMeal() {
		return meal;
	}

	public void setMeal(ArrayList<Meal> meal) {
		this.meal = meal;
	}

}
