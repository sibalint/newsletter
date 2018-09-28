package org.marketing.newsletter.repository;

import org.marketing.newsletter.model.Newsletter;

import java.util.List;

public interface NewsletterRepository {

    List<Newsletter> getRecentNewsletters();

}
