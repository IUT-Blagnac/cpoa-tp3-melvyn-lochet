package tp3.pizzeria.factory;

import tp3.pizza.factory.impl.PizzaFactoryBrest;
import tp3.pizza.factory.impl.PizzaFactoryStrasbourg;
import tp3.pizzeria.Pizzeria;
import tp3.pizzeria.impl.PizzeriaBrest;
import tp3.pizzeria.impl.PizzeriaStrasbourg;

public class PizzeriaFactory {
	
	private static PizzeriaFactory uniqueInstance = new PizzeriaFactory();
	
	private PizzeriaFactory() {
		
	}
	
	public static PizzeriaFactory getInstance() {
		return uniqueInstance;
	}

	public Pizzeria create(String string) {
		if(string.equals("Brest")) {
			return new PizzeriaBrest(PizzaFactoryBrest.getInstance());
		}
		if(string.equals("Strasbourg")) {
			return new PizzeriaStrasbourg(PizzaFactoryStrasbourg.getInstance());
		}
		else {
			return null;
		}
	}

}
