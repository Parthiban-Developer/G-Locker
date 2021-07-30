package com.locker.glock.entity;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "booking")
public class BookingEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "third_person_otp")
	private String thirdPersonOTP;

	@Column(name = "user_mtp")
	private String userMTP;

	@Column(name = "booking_hrs")
	private String bookingHrs;

	@Column(name = "estimated_fair")
	private String estimatedFair;

	@Column(name = "booking_time")
	private Timestamp bookingTime;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private CustomerEntity customer;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private RackerEntity racker;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private LockerEntity locker;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private ServiceEntity service;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "bookings")
	private PaymentEntity payment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getThirdPersonOTP() {
		return thirdPersonOTP;
	}

	public void setThirdPersonOTP(String thirdPersonOTP) {
		this.thirdPersonOTP = thirdPersonOTP;
	}

	public String getUserMTP() {
		return userMTP;
	}

	public void setUserMTP(String userMTP) {
		this.userMTP = userMTP;
	}

	public String getBookingHrs() {
		return bookingHrs;
	}

	public void setBookingHrs(String bookingHrs) {
		this.bookingHrs = bookingHrs;
	}

	public String getEstimatedFair() {
		return estimatedFair;
	}

	public void setEstimatedFair(String estimatedFair) {
		this.estimatedFair = estimatedFair;
	}

	public Timestamp getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(Timestamp bookingTime) {
		this.bookingTime = bookingTime;
	}

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	public RackerEntity getRacker() {
		return racker;
	}

	public void setRacker(RackerEntity racker) {
		this.racker = racker;
	}

	public LockerEntity getLocker() {
		return locker;
	}

	public void setLocker(LockerEntity locker) {
		this.locker = locker;
	}

	public ServiceEntity getService() {
		return service;
	}

	public void setService(ServiceEntity service) {
		this.service = service;
	}

	public PaymentEntity getPayment() {
		return payment;
	}

	public void setPayment(PaymentEntity payment) {
		this.payment = payment;
	}

}