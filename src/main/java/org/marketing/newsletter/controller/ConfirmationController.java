package org.marketing.newsletter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConfirmationController {

    @GetMapping("/thank-you")
    public String getConfirmation(Model model){
        model.addAttribute("numberOfNewslettersSubscription",452);//FIXME: do not hardcode  this into the java code
        return "confirmation";
    }

}
