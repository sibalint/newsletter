package org.marketing.newsletter.service.exception;

public class SubscriptionAlreadyExistsException extends Exception {

	public SubscriptionAlreadyExistsException(String message) throws SubscriptionAlreadyExistsException{ 
		super(message);
	}
}
