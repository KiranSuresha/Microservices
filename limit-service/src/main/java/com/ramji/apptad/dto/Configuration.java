/**
 * 
 */
package com.ramji.apptad.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author kiransuresh
 *
 */
@Component
@ConfigurationProperties(prefix="limit-service")
public class Configuration {

	
	private int maximum;
	
	private int minimum;

	public final int getMaximum() {
		return maximum;
	}

	public final void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public final int getMinimum() {
		return minimum;
	}

	public final void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	
	
}
