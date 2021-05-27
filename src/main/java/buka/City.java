package buka;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

class City {
	private @Id @GeneratedValue Long id; 
	private String name;
	
	City() {}
	
	public City(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
