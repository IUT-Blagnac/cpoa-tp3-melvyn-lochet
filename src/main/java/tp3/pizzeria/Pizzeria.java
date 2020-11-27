package tp3.pizzeria;

import tp3.pizza.Pizza;
import tp3.pizza.factory.PizzaFactory;

// TODO : Faire les pizzeria de brest et strasbourg

public abstract class Pizzeria {
	
	private PizzaFactory pizzaFactory;
	
	public Pizzeria(PizzaFactory pizzaFactory) {
		this.pizzaFactory = pizzaFactory;
	}

	public Pizza orderPizza(String type) {
		return this.createPizza(type);
	}
	
	protected Pizza createPizza(String type) {
		return pizzaFactory.create(type);
	}
}
