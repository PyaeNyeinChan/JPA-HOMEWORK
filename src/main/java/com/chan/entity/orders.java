package com.chan.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class orders implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int id;
	private Date orderDate;
	private int subTotal;
	private int tax;
	private int deliveryFees;
	@ManyToOne
	@JoinColumn(name = "customer_id", referencedColumnName = "id")
	private customer Customers;
	
	@OneToMany(mappedBy = "Orders")
	private List<order_details> od;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public int getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(int subTotal) {
		this.subTotal = subTotal;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getDeliveryFees() {
		return deliveryFees;
	}
	public void setDeliveryFees(int deliveryFees) {
		this.deliveryFees = deliveryFees;
	}
	
	
}
