package com.cg.capstore.beans;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="FeedbackCommon")
public class FeedbackCommonBean {
	@Id
	@Column(name="Feedback_common_id")
	private String id;

	@ManyToOne
	@JoinColumn(name="merchant_id")
	private MerchantBean merchant;

	@ManyToOne
	@JoinColumn(name="customer_id")
	private CustomerBean customer;

	@Column(name="comments")
	private String comments;

	@Column(name="date")
	private Date date;


	public FeedbackCommonBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FeedbackCommonBean(String id, CustomerBean customer, String comments, Date date, MerchantBean merchant) {
		super();
		this.id = id;
		this.customer = customer;
		this.comments = comments;
		this.date = date;
		this.merchant = merchant;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
