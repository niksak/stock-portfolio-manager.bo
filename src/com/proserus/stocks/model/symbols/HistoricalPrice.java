package com.proserus.stocks.model.symbols;

import java.math.BigDecimal;

import org.jfree.data.time.Year;


public interface HistoricalPrice {

	public Year getYear();
	
	public void setYear(Year year);

	public BigDecimal getPrice();
	
	public void setPrice(BigDecimal price);

	public BigDecimal getCustomPrice();

	public void setCustomPrice(BigDecimal value);

}


