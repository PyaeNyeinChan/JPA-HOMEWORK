package com.chan.jpaHomework.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class order_details implements Serializable{
	@Id
	private int id;
	private int quentity;
	private int unitPrice;
	
	@ManyToOne
	@JoinColumn(name = "order_id", referencedColumnName = "id")
	private orders Orders;
	
	@ManyToOne
	@JoinColumn(name = "product_id", referencedColumnName = "id")
	private product Product;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuentity() {
		return quentity;
	}
	public void setQuentity(int quentity) {
		this.quentity = quentity;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
}
