/**
 * 
 */
package com.ramji.apptad.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ramji.apptad.dao.ExchangValueDAO;
import com.ramji.apptad.dto.ExchangeValue;

/**
 * @author kiransuresh
 *
 */

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private ExchangValueDAO exchangeValueDAO;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveCurrencyValue(@PathVariable String from, @PathVariable String to) {
		//ExchangeValue currencyExcangeDTO = null;//new ExchangeValue(1L, "USD", "INR", new BigDecimal(12.0));
		//ExchangeValue currencyExcangeDTO = null;
		int port = Integer.parseInt(environment.getProperty("server.port"));
		ExchangeValue allExchangeValue = exchangeValueDAO.findByFromAndTo(from, to);
		//System.out.println(allExchangeValue.size());
		allExchangeValue.setPort(port);
		return allExchangeValue;
	}
	

}
