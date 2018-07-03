package org.marketing.newsletter.repository.impl;

import org.marketing.newsletter.model.Subscription;
import org.marketing.newsletter.repository.SubscriptionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class DummySubscriptionRepositoryImpl implements SubscriptionRepository {

	private Logger log = LoggerFactory.getLogger(getClass());
	
	@Override
	public void save(Subscription subscription) {
		log.info("'saves' {} now..." + subscription);

	}

}
