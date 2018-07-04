package org.marketing.newsletter.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Subscription {
	
	@NotBlank //ellenörzi, h ki van e töltve a mező
	@Size(min = 3, max = 30) //söveg méret korlátozás 3-30 karakter hosszú
	private String fullName;
	
	@NotBlank
	@Email //elamil formátum
	private String emailAdress; 

	public Subscription () {
		
	}
	
	public Subscription(String fullName, String emailAdress) {
		this.fullName = fullName;
		this.emailAdress = emailAdress;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	@Override
	public String toString() {
		return "Subscription [fullName=" + fullName + ", emailAdress=" + emailAdress + "]";
	}
	
	
}
