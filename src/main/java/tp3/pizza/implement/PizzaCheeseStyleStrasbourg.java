package tp3.pizza.implement;

import java.util.ArrayList;

import tp3.pizza.Pizza;

public class PizzaCheeseStyleStrasbourg extends Pizza {
	
	public PizzaCheeseStyleStrasbourg() {
		this.name = "Strasbourg style with cheese";
		this.crust = "Thick Crust";
		this.sauce = "Cream";
		this.garnitures = new ArrayList<String>();
		this.garnitures.add("Mozzarella");
	}
	
	@Override
	public void cut() {
		System.out.println("Cut the pizza in triangles");
	}

}
