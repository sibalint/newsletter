package org.marketing.newsletter.service;

import org.marketing.newsletter.model.Subscription;
import org.marketing.newsletter.service.exception.SubscriptionAlreadyExistsException;

public interface SubscriptionService {

	void register(Subscription subscription) throws SubscriptionAlreadyExistsException;
}
