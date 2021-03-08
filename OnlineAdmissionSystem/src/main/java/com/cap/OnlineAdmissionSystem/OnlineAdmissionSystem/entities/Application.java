package com.cap.OnlineAdmissionSystem.OnlineAdmissionSystem.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Application {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	
	private String emailId;
	
	public Application() {}

	public Application(String emailId) {
		super();
		this.emailId = emailId;
	}

	public int getApplicationID() {
		return Id;
	}

	public void setApplicationID(int Id) {
		this.Id = Id;
	}

	@Override
	public String toString() {
		return "Application [applicationID=" + Id+ ", emailId=" + emailId + "]";
	}
	
	
	
	

}
