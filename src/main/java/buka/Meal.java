package buka;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Meal {
	private @Id @GeneratedValue Long id;
	private int price;
	private String description;
	private int duration;
	
	public Meal() {}
	
	public Meal(Long id, int price, String description, int duration) {
		super();
		this.id = id;
		this.price = price;
		this.description = description;
		this.duration = duration;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
}
