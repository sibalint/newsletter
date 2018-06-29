package org.marketing.newsletter;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component //ez egy komponens
public class HelloWorld {
	
	@PostConstruct //amikor a spring lepéldányosítja ezt a komponenst a spring meghívja ezt a metódust
	public void hello() {
		System.out.println("Hello World!!!");
	}

}
