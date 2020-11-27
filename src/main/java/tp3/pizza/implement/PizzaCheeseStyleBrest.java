package tp3.pizza.implement;

import java.util.ArrayList;

import tp3.pizza.Pizza;

public class PizzaCheeseStyleBrest extends Pizza {

	public PizzaCheeseStyleBrest() {
		this.name = "Brest style sauce and cheese";
		this.crust = "Thin Crust";
		this.sauce = "Tomato";
		this.garnitures = new ArrayList<String>();
		this.garnitures.add("Parmigiano reggiano");
	}
}
