package com.in28minutes.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.*;

public interface  CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long>{
	
	CurrencyExchange findByFromAndTo(String from,String to);

}
