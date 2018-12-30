/**
 * 
 */
package com.ramji.apptad.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ramji.apptad.dto.CurrencyConversionBean;
import com.ramji.apptad.proxy.CurrencyConversionProxy;

/**
 * @author kiransuresh
 *
 */
@RestController
public class CurrencyConverterController {
	
	@Autowired
	private CurrencyConversionProxy proxy;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean getData(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
		
		CurrencyConversionBean bean = new CurrencyConversionBean();
		Map<String, String> uriVariable = new HashMap<>();
		uriVariable.put("from", from);
		uriVariable.put("to", to);
		
		ResponseEntity<CurrencyConversionBean> entity = new RestTemplate().getForEntity("Http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class, uriVariable);
		
		CurrencyConversionBean conversionBean = entity.getBody();
		
		//BigDecimal totalAmount = (conversionBean.getConversionMultiple().multiply(quantity));
		
		conversionBean.setTotalAmount(conversionBean.getConversionMultiple().multiply(quantity));
		return conversionBean;
	}
	
	@GetMapping("/currency-exchange-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean getDataFeign(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
		
		CurrencyConversionBean bean = new CurrencyConversionBean();
		/*Map<String, String> uriVariable = new HashMap<>();
		uriVariable.put("from", from);
		uriVariable.put("to", to);
		
		ResponseEntity<CurrencyConversionBean> entity = new RestTemplate().getForEntity("Http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class, uriVariable);
		
		CurrencyConversionBean conversionBean = entity.getBody();
		
		//BigDecimal totalAmount = (conversionBean.getConversionMultiple().multiply(quantity));
		
		conversionBean.setTotalAmount(conversionBean.getConversionMultiple().multiply(quantity));*/
		bean = proxy.retrieveCurrencyValue(from, to);
		bean.setTotalAmount(quantity.multiply(bean.getConversionMultiple()));
		return bean;
	}

}
