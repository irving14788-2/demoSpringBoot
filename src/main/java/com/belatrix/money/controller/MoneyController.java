package com.belatrix.money.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.belatrix.money.service.MoneyService;

@Controller
public class MoneyController {

	@Autowired
	MoneyService moneyService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	String index(ModelMap model){
		return "index";
	}
	
	@RequestMapping(value = "/calcular", method = RequestMethod.POST)
	String calcular(ModelMap model, HttpServletRequest request){
		double cantidadDolares = Double.parseDouble(request.getParameter("dolar"));
		double valorEuros = moneyService.calcularEuros(cantidadDolares);
		model.addAttribute("valorEuros", valorEuros);
		
		return "index";
	}
}
