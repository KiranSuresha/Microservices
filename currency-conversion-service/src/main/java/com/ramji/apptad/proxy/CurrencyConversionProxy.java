/**
 * 
 */
package com.ramji.apptad.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ramji.apptad.dto.CurrencyConversionBean;

/**
 * @author kiransuresh
 *
 */
//only Feign client then we need to have name of the servive wh
//@FeignClient(name="currency-exchange-service", url="localhost:8000")
//Once we have Ribbon client and service is running more than one port then we remove url from above and introduce @ribbonclient.
//setting are in main class and applicatin.properties, currency-exchange-service.ribbon.listOfServers=http://localhost:8000, http://localhost:8001
//@FeignClient(name="currency-exchange-service")
// now again we need to introduce API proxy named ZUUL server so will change the @FeignClient and URL of getmapping
@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyConversionProxy {
	
	//@GetMapping("/currency-exchange/from/{from}/to/{to}")
	// For ZUUL server
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveCurrencyValue(@PathVariable String from, @PathVariable String to) ;
	
	}
