package buka.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Meal")
public class Meal {
	@Id 
	@GeneratedValue
	private Long id;
	private int price;
	private String description;
	private int duration;
	@ManyToOne
	@JoinColumn(name = "provider_id")
	private ServiceProvider provider;
	
	public Meal() {}

	public Meal(int price, String description, int duration, ServiceProvider provider) {
		this.price = price;
		this.description = description;
		this.duration = duration;
		this.provider = provider;
	}

}
