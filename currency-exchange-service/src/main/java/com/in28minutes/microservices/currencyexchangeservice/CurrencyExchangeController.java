package com.in28minutes.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	Logger logger=LoggerFactory.getLogger(CurrencyExchangeController.class);
    
	@Autowired
	private CurrencyExchangeRepository repo;
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveValue(@PathVariable String from ,@PathVariable String to ) {
		
		logger.info("retrieve exchange value called with {} to {} ",from,to );
		
//		CurrencyExchange currencyExchange= new CurrencyExchange(100L,"USD","IND",BigDecimal.valueOf(40));
		CurrencyExchange currencyExchange=repo.findByFromAndTo(from, to);
		String port = environment.getProperty("local.server.port"); 
		currencyExchange.setEnvironment(port);
		 
		if(currencyExchange == null ) {
			throw new RuntimeException("Data is not exist");	
		}

		
		return currencyExchange;
	}
	
}
