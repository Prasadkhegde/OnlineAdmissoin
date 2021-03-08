package com.cap.OnlineAdmissionSystem.OnlineAdmissionSystem.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paymentId;
	private String emailId;
	private double paymentAmount;
	private String paymentDescription;
	private LocalDate paymentDate;
	private String paymentStatus;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Id")
	Application application;
	
	public double getPaymentAmount() {
		return paymentAmount;
	}



	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}



	public String getPaymentDescription() {
		return paymentDescription;
	}



	public void setPaymentDescription(String paymentDescription) {
		this.paymentDescription = paymentDescription;
	}



	public LocalDate getPaymentDate() {
		return paymentDate;
	}



	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}



	public Application getApplication() {
		return application;
	}



	public void setApplication(Application application) {
		this.application = application;
	}

	
	public Payment() {}
	
	
	
	public Payment(String emailId, double paymentAmount, String paymentDescription, LocalDate paymentDate,
			String paymentStatus,Application application) {
		super();
		this.emailId = emailId;
		this.paymentAmount = paymentAmount;
		this.paymentDescription = paymentDescription;
		this.paymentDate = paymentDate;
		this.paymentStatus = paymentStatus;
		this.application = application;
	}



	public int getId() {
		return paymentId;
	}



	public void setId(int paymentId) {
		this.paymentId = paymentId;
	}



	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	public String getPaymentStatus() {
		return paymentStatus;
	}



	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}



	@Override
	public String toString() {
		return "Payment [id=" + paymentId + ", emailId=" + emailId + ", paymentAmount=" + paymentAmount
				+ ", paymentDescription=" + paymentDescription + ", paymentDate=" + paymentDate + ", paymentStatus="
				+ paymentStatus + "]";
	}
	
	
	
	
	

}
