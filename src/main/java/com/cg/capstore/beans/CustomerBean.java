package com.cg.capstore.beans;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class CustomerBean {

	@Id
	@Column(name="customer_id")
	private String email;

	@Column(name="password")
	private String password;

	@Column(name="customer_name")
	private String customerName;

	@Column(name="mobile_num")
	private String mobileNo;

	@Column(name="address")
	private String address;
	
	@OneToOne
	@JoinColumn(name="wishlist_id")
	private WishlistBean wishlist;

	@OneToMany
	@Column(name="cart")
	private List<ProductBean> cart;

	@OneToOne
	@JoinColumn(name="order_id")
	private OrderBean order;
	

	public List<ProductBean> getCart() {
		return cart;
	}
	public void setCart(List<ProductBean> cart) {
		this.cart = cart;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCustomerName() {
		return customerName;
	}
}
