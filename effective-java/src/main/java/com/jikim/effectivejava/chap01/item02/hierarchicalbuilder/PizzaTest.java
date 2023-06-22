package com.jikim.effectivejava.chap01.item02.hierarchicalbuilder;

import static com.jikim.effectivejava.chap01.item02.hierarchicalbuilder.NyPizza.Size.*;
import static com.jikim.effectivejava.chap01.item02.hierarchicalbuilder.Pizza.Topping.*;

public class PizzaTest {
	public static void main(String[] args) {
		NyPizza nyPizza = new NyPizza.Builder(SMALL)
			.addTopping(SAUSAGE)
			.addTopping(ONION)
			.build();
		Calzone calzone = new Calzone.Builder()
			.addTopping(HAM).sauceInside().build();

		System.out.println(nyPizza);
		System.out.println(calzone);
	}
}
