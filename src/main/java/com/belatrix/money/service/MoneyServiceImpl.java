package com.belatrix.money.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.belatrix.money.bean.ResponseBean;

@Service
public class MoneyServiceImpl implements MoneyService{
	
	@Override
	public double calcularEuros(double cantidadDolares) {		
		RestTemplate restTemplate = new RestTemplate();
		ResponseBean responseEntity = restTemplate.getForObject("http://api.fixer.io/latest?base=USD&symbols=EUR", ResponseBean.class);
		System.out.println(responseEntity.toString());
		
		return cantidadDolares*responseEntity.getRates().getEur();
	}

}
