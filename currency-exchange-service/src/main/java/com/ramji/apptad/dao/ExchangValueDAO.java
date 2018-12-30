/**
 * 
 */
package com.ramji.apptad.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ramji.apptad.dto.ExchangeValue;

/**
 * @author kiransuresh
 *
 */
public interface ExchangValueDAO extends JpaRepository<ExchangeValue, Long>{
	
	//@Query(select * from )
	public ExchangeValue findByFromAndTo(String from, String to);

}
