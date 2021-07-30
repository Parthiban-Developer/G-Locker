package com.locker.glock.dto;

import java.sql.Timestamp;

public class PaymentDto {

	private Long id;

	private boolean baseFair;

	private String rewardDiscount;

	private String netAmount;

	private String tax;

	private String payment;

	private String invoiceLink;

	private String openMins;

	private String usageMins;

	private Timestamp PaidTime;

	private CustomerDto customer;

	private BookingDto bookings;

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

	public CustomerDto getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDto customer) {
		this.customer = customer;
	}

	public BookingDto getBookings() {
		return bookings;
	}

	public void setBookings(BookingDto bookings) {
		this.bookings = bookings;
	}
	
}