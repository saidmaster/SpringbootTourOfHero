package org.hero.test.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hero")
public class Hero {

	@Id @GeneratedValue
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Hero(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Hero() {
		super();
	}
	
	
}
