package org.marketing.newsletter;

import org.marketing.newsletter.model.Subscription;
import org.marketing.newsletter.service.SubscriptionService;
import org.marketing.newsletter.service.exception.SubscriptionAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewsletterApplication implements CommandLineRunner {

	@Autowired
	private SubscriptionService service;
	 
	public static void main(String[] args) {
		SpringApplication.run(NewsletterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Subscription subscription = new Subscription();
		subscription.setFullName("Jhon Doe");
		subscription.setEmailAdress("Jhon@email.com");
		try {
			service.register(subscription);
		} catch (SubscriptionAlreadyExistsException duplicate) {
			System.err.println("Sorry, there is already a registration with this e-mail adress");
		}
		
	}
}
