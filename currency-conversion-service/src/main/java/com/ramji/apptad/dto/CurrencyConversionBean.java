/**
 * 
 */
package com.ramji.apptad.dto;

import java.math.BigDecimal;

/**
 * @author kiransuresh
 *
 */
public class CurrencyConversionBean {
	
	private Long id;
	
	private String from;
	
	private String to;
	
	private BigDecimal conversionMultiple;
	
	private BigDecimal quantity;
	
	private BigDecimal totalAmount;
	
	private Integer port;

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

	public final Integer getPort() {
		return port;
	}

	public final void setPort(Integer port) {
		this.port = port;
	}

	
	
	public final BigDecimal getQuantity() {
		return quantity;
	}

	public final void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public final BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public final void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	
	public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
			BigDecimal totalAmount, Integer port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
		this.port = port;
	}

	public CurrencyConversionBean() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	

}
