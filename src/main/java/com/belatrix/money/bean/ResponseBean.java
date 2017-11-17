package com.belatrix.money.bean;

import java.io.Serializable;

public class ResponseBean implements Serializable{

	public String base;
    public String date;
    public Rates rates;
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Rates getRates() {
		return rates;
	}
	public void setRates(Rates rates) {
		this.rates = rates;
	}
	@Override
	public String toString() {
		return "ResponseBean [base=" + base + ", date=" + date + ", rates=" + rates.getEur() + "]";
	}
	
    
}
