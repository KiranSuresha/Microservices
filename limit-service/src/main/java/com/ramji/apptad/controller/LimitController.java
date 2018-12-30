/**
 * 
 */
package com.ramji.apptad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramji.apptad.dto.Configuration;
import com.ramji.apptad.dto.LimitConfiguration;

/**
 * @author kiransuresh
 *
 */

@RestController
public class LimitController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limit")
	public LimitConfiguration getLimit() {
		return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
	}
	
}
