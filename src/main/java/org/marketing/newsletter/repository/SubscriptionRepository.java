package org.marketing.newsletter.repository;

import org.marketing.newsletter.model.Subscription;

public interface SubscriptionRepository {
	
	void save(Subscription subscription);
}
