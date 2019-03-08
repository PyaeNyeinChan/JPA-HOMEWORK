package com.chan.jpaHomework.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

@Entity
public class township implements Serializable {
	@Id
	private int id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "state_id", referencedColumnName = "id")
	private state State;
	
	@OneToMany
	private List<customer> Customer;
	
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
	
	
}
