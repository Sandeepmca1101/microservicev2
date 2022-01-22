package comin28minutes.microservice.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import comin28minutes.microservice.limitsservice.bean.Limits;
import comin28minutes.microservice.limitsservice.cofiguration.Configuration;

@RestController
public class LimitsController {
	
	
	@Autowired
	private Configuration configuration;
	
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
//		return new Limits(1,1000);
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
		
	}

}
