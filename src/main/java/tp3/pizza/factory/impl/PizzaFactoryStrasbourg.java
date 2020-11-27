package tp3.pizza.factory.impl;

import tp3.pizza.Pizza;
import tp3.pizza.factory.PizzaFactory;
import tp3.pizza.implement.PizzaCheeseStyleStrasbourg;

public class PizzaFactoryStrasbourg extends PizzaFactory {
	private static PizzaFactoryStrasbourg instance = new PizzaFactoryStrasbourg();
	
	private PizzaFactoryStrasbourg() {
		
	}
	
	public static PizzaFactoryStrasbourg getInstance() {
		return instance;
	}

	@Override
	public Pizza create(String name) {
		Pizza pizza = null;
		if(name.equals("cheese")) {
			pizza = new PizzaCheeseStyleStrasbourg();
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.wrap();
		}
		if(name.equals("poivron")) {
			
		}
		
		return pizza;
	}
}
