package buka.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name =  "Buka")
public class ServiceProvider {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO ) 
	private Long id;
	private String name;
	private String email;
	private int number;
	@OneToMany (
			mappedBy = "provider",
			cascade = CascadeType.ALL,
			orphanRemoval = true
			)
	private List<Meal> meals = new ArrayList<>();
	@ManyToOne
	@JoinColumn(name = "city")
	private City city;
	
	ServiceProvider() {
	}
	
	public ServiceProvider(String name, String email, int number, City city) {
		this.name = name;
		this.email = email;
		this.number = number;
		this.city = city;
	}
	
	public void setMeals(List<Meal> meals) {
		this.meals = meals;
	}

	@Override
	public String toString() {
		return "ServiceProvider [id=" + id + ", name=" + name + ", email=" + email + ", number=" + number + "]";
	}
}