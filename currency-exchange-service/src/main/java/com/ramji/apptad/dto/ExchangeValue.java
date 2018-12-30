package com.ramji.apptad.dto;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class ExchangeValue {
	
	@Id
	private Long id;
	
	@Column(name="currency_from")
	private String from;
	
	@Column(name="currency_to")
	private String to;
	
	private BigDecimal conversionMultiple;
	
	private int port;
	
	

	public final int getPort() {
		return port;
	}

	public final void setPort(int port) {
		this.port = port;
	}

	public final Long getId() {
		return id;
	}

	public final void setId(Long id) {
		this.id = id;
	}

	public final String getFrom() {
		return from;
	}

	public final void setFrom(String from) {
		this.from = from;
	}

	public final String getTo() {
		return to;
	}

	public final void setTo(String to) {
		this.to = to;
	}



	public final BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public final void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public ExchangeValue(Long id, String from, String to, BigDecimal currencyRate) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = currencyRate;
	}

	public ExchangeValue() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
