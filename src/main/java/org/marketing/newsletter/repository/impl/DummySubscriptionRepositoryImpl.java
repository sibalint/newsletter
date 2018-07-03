package org.marketing.newsletter.repository.impl;

import org.marketing.newsletter.model.Subscription;
import org.marketing.newsletter.repository.SubscriptionRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DummySubscriptionRepositoryImpl implements SubscriptionRepository {

	@Override
	public void save(Subscription subscription) {
		System.out.println("DummySubscriptionRepositoryImpl: 'saves' " + subscription);

	}

}
