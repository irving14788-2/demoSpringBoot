package com.belatrix.money.bean;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rates implements Serializable{
	
	@JsonProperty("EUR")
	private double eur;

	public double getEur() {
		return eur;
	}

	public void setEur(double eur) {
		this.eur = eur;
	}
	
}
