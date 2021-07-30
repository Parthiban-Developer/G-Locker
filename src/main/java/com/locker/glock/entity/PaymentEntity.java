package com.locker.glock.entity;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "payment")
public class PaymentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "base_fair")
	private boolean baseFair;

	@Column(name = "reward_discount")
	private String rewardDiscount;

	@Column(name = "net_amount")
	private String netAmount;

	private String tax;

	private String payment;

	@Column(name = "invoice_link")
	private String invoiceLink;

	@Column(name = "opened_mins")
	private String openMins;

	@Column(name = "used_mins")
	private String usageMins;

	@Column(name = "paid_time")
	private Timestamp PaidTime;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private CustomerEntity customer;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "booking_id", nullable = false)
	private BookingEntity bookings;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isBaseFair() {
		return baseFair;
	}

	public void setBaseFair(boolean baseFair) {
		this.baseFair = baseFair;
	}

	public String getRewardDiscount() {
		return rewardDiscount;
	}

	public void setRewardDiscount(String rewardDiscount) {
		this.rewardDiscount = rewardDiscount;
	}

	public String getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(String netAmount) {
		this.netAmount = netAmount;
	}

	public String getTax() {
		return tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getInvoiceLink() {
		return invoiceLink;
	}

	public void setInvoiceLink(String invoiceLink) {
		this.invoiceLink = invoiceLink;
	}

	public String getOpenMins() {
		return openMins;
	}

	public void setOpenMins(String openMins) {
		this.openMins = openMins;
	}

	public String getUsageMins() {
		return usageMins;
	}

	public void setUsageMins(String usageMins) {
		this.usageMins = usageMins;
	}

	public Timestamp getPaidTime() {
		return PaidTime;
	}

	public void setPaidTime(Timestamp paidTime) {
		PaidTime = paidTime;
	}

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	public BookingEntity getBookings() {
		return bookings;
	}

	public void setBookings(BookingEntity bookings) {
		this.bookings = bookings;
	}
}