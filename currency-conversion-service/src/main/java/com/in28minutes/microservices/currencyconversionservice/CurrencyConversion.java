package com.in28minutes.microservices.currencyconversionservice;

import java.math.BigDecimal;

//import javax.persistence.Column;
//import javax.persistence.Id;


public class CurrencyConversion {
	
//	 @Id
	 private Long id;
//	@Column(name="currency_from")
     private String from;
//	@Column(name="currency_to")
	 private String to;
	 
	 private BigDecimal quantity;
	 private BigDecimal conversionMultiple;
	 private BigDecimal totalCalulatedAmount;
	 private String environment;
	 
	public CurrencyConversion() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public CurrencyConversion(Long id, String from, String to, BigDecimal quantity, BigDecimal conversionMultiple,
			BigDecimal totalCalulatedAmount, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.conversionMultiple = conversionMultiple;
		this.totalCalulatedAmount = totalCalulatedAmount;
		this.environment = environment;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public BigDecimal getTotalCalulatedAmount() {
		return totalCalulatedAmount;
	}

	public void setTotalCalulatedAmount(BigDecimal totalCalulatedAmount) {
		this.totalCalulatedAmount = totalCalulatedAmount;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		return "CurrencyConversion [id=" + id + ", from=" + from + ", to=" + to + ", conversionMultiple="
				+ conversionMultiple + ", totalCalulatedAmount=" + totalCalulatedAmount + ", environment=" + environment
				+ "]";
	}
	
	
	 
	 
	

}
