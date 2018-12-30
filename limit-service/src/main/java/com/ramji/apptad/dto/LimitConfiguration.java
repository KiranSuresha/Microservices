package com.ramji.apptad.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*@Component
@ConfigurationProperties(prefix="limit-service")*/
public class LimitConfiguration {
	
	private int minLimit;
	
	private int maxLimit;

	public final int getMinLimit() {
		return minLimit;
	}

	public final void setMinLimit(int minLimit) {
		this.minLimit = minLimit;
	}

	public final int getMaxLimit() {
		return maxLimit;
	}

	public final void setMaxLimit(int maxLimit) {
		this.maxLimit = maxLimit;
	}

	public LimitConfiguration(int minLimit, int maxLimit) {
		super();
		this.minLimit = minLimit;
		this.maxLimit = maxLimit;
	}
	
	protected LimitConfiguration() {
		
	}

}
