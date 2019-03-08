package com.chan.jpaHomework.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class product {
	@Id
	private int id;
	private String name;
	private int price;
	
	@OneToMany
	private List<order_details>OrderDetails;
	
	@ManyToOne
	@JoinColumn(name = "category_id", referencedColumnName = "id")
	private category Category;

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
