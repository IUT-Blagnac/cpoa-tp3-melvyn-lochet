package tp3;

import tp3.pizza.Pizza;
import tp3.pizzeria.Pizzeria;
import tp3.pizzeria.factory.PizzeriaFactory;

public class PizzaTestDrive {
	public static void main(String[] args) {
		// PizzeriaFactory doit etre un singleton
		PizzeriaFactory factory = PizzeriaFactory.getInstance();
        Pizzeria shopFromBrest = factory.create("Brest");
        Pizzeria shopFromStrasbourg = factory.create("Strasbourg");
        
        //PizzaFactory doit être un singleton
        Pizza pizza = shopFromBrest.orderPizza("cheese");
        System.out.println("JMB has ordered a " + pizza.getName() + "\n");

        pizza = shopFromStrasbourg.orderPizza("cheese");
        System.out.println("JMI has ordered a " + pizza.getName() + "\n");
    }
}
