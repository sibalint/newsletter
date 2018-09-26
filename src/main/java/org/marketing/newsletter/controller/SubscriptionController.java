package org.marketing.newsletter.controller;

import org.marketing.newsletter.model.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SubscriptionController {

    private static final String PATH_SUBSCRIBE = "/subscribe";

    private final Logger logger= LoggerFactory.getLogger(getClass());

    @GetMapping(value = {"/", PATH_SUBSCRIBE})
    public String getSubscriptionForm(){
        return "subscription-form";
    }

    @PostMapping(PATH_SUBSCRIBE)
    public String submitSubscription(Subscription subscription){
        logger.debug("user submitter this subscription: {}",subscription);
        return "redirect:/thank-you";
    }

}
