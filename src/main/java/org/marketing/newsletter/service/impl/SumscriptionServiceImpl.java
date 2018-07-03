package org.marketing.newsletter.service.impl;

import org.marketing.newsletter.model.Subscription;
import org.marketing.newsletter.repository.SubscriptionRepository;
import org.marketing.newsletter.service.SubscriptionService;
import org.marketing.newsletter.service.exception.SubscriptionAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SumscriptionServiceImpl implements SubscriptionService {

	@Autowired
	private SubscriptionRepository repository;
	
	@Override
	public void register(Subscription subscription) throws SubscriptionAlreadyExistsException {
		System.out.println("SubscriptionServiceImpl registers" + subscription);
		
		try {
		repository.save(subscription);
		} catch (RuntimeException duplicate) { //FIXME:  add proper exception type
			throw new SubscriptionAlreadyExistsException("Subscription already exists with email: " + subscription.getEmailAdress());
		}
	}

}
