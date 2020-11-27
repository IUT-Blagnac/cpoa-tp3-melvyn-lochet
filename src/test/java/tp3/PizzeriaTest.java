package tp3;

import static org.junit.Assert.*;
import org.junit.Test;

import tp3.pizza.Pizza;
import tp3.pizza.factory.PizzaFactory;
import tp3.pizza.factory.impl.PizzaFactoryBrest;
import tp3.pizza.factory.impl.PizzaFactoryStrasbourg;
import tp3.pizzeria.Pizzeria;
import tp3.pizzeria.factory.PizzeriaFactory;

public class PizzeriaTest {

    @Test
    public void anOrderedPizzaIsNotNull() {
    	
        Pizzeria boutiqueBrest = PizzeriaFactory.getInstance().create("Brest");
        Pizza miam = boutiqueBrest.orderPizza("cheese");
        assertNotNull("An Ordered Pizza Is Not Null",miam);
    }

    @Test
    public void twoOrderedPizzasAreDifferent() {
        Pizzeria boutiqueBrest = PizzeriaFactory.getInstance().create("Brest");
        Pizzeria boutiqueStrasbourg = PizzeriaFactory.getInstance().create("Strasbourg");
        Pizza miam1 = boutiqueBrest.orderPizza("cheese");
        Pizza miam2 = boutiqueStrasbourg.orderPizza ("Greek");
        assertNotEquals("Two Ordered Pizzas Are Different",miam1,miam2);
    }
    
    @Test 
    public void twoOrderedPizzasFromBrestAreDifferent() {
    	Pizzeria boutiqueBrest = PizzeriaFactory.getInstance().create("Brest");
    	Pizza miam1 = boutiqueBrest.orderPizza("cheese");
    	Pizza miam2 = boutiqueBrest.orderPizza("cheese");
    	assertNotEquals("Two Ordered Pizzas from Brest Are Different",miam1,miam2);
    }
    
    @Test 
    public void twoOrderedPizzasFromStrasbourgAreDifferent() {
    	Pizzeria boutiqueStrasbourg = PizzeriaFactory.getInstance().create("Strasbourg");
    	Pizza miam1 = boutiqueStrasbourg.orderPizza("cheese");
    	Pizza miam2 = boutiqueStrasbourg.orderPizza("cheese");
    	assertNotEquals("Two Ordered Pizzas from Brest Are Different",miam1,miam2);
    }
    
   
    
}