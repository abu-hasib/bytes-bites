package buka;

//import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;

@Entity

class ServiceProvider {
	private @Id @GeneratedValue Long id;
	private String name;
	private String email;
	private int number;
//	private @ManyToOne City city;
//	private ArrayList<Meal> meal;
	ServiceProvider() {
	}

	public ServiceProvider(String name, String email, int number) {
		this.name = name;
		this.email = email;
		this.number = number;
//		this.city = city;
//		this.meal = meal;
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

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "ServiceProvider [id=" + id + ", name=" + name + ", email=" + email + ", number=" + number + "]";
	}

	public void setNumber(int number) {
		this.number = number;
	}

//	public City getCity() {
//		return city;
//	}
//
//	public void setCity(City city) {
//		this.city = city;
//	}

//	public ArrayList<Meal> getMeal() {
//		return meal;
//	}

//	public void setMeal(ArrayList<Meal> meal) {
//		this.meal = meal;
//	}

}
