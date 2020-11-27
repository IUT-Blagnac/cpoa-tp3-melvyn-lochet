package tp3.pizza.factory.impl;

import tp3.pizza.Pizza;
import tp3.pizza.factory.PizzaFactory;
import tp3.pizza.implement.PizzaCheeseStyleBrest;

public class PizzaFactoryBrest extends PizzaFactory {
	private static PizzaFactoryBrest instance = new PizzaFactoryBrest();
	
	private PizzaFactoryBrest() {
		
	}
	
	public static PizzaFactoryBrest getInstance() {
		return instance;
	}

	@Override
	public Pizza create(String name) {
		Pizza pizza = null;
		
		if(name.equals("cheese")) {
			pizza = new PizzaCheeseStyleBrest();
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

