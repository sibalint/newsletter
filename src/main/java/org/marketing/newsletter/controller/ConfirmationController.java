package org.marketing.newsletter.controller;

import org.marketing.newsletter.model.Newsletter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ConfirmationController {

    private final List<Newsletter> recentNewsletters= Arrays.asList(
            new Newsletter("Extreme price-cut! 50% OFF!","..."),
            new Newsletter("New store in W-London","...")
    );

    @GetMapping("/thank-you")
    public String getConfirmation(Model model){
        model.addAttribute("numberOfNewslettersSubscription",452);//FIXME: do not hardcode  this into the java code
        model.addAttribute("newsletterHighlights",recentNewsletters);
        return "confirmation";
    }

}
