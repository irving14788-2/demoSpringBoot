package com.belatrix.money;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.belatrix.money.service.MoneyService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EjercicioApplicationTests {


	@Autowired
	MoneyService moneyService;
	   
	@Test
	public void calcularEuros() {
		
		double euros = moneyService.calcularEuros(12);
		
		Assert.assertNotNull("fallo null ", euros);
		Assert.assertTrue("fallo esperaba un numero mayor a 0  ", euros>0.0);
	}

}
