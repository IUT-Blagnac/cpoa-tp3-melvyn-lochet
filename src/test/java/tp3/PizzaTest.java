package tp3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import tp3.pizza.factory.PizzaFactory;
import tp3.pizza.factory.impl.PizzaFactoryBrest;
import tp3.pizza.factory.impl.PizzaFactoryStrasbourg;

public class PizzaTest {
	@Test
    public void twoPizzaFactoryBrestAreTheSame () {
    	PizzaFactory fact1 = PizzaFactoryBrest.getInstance();
    	PizzaFactory fact2 = PizzaFactoryBrest.getInstance();
    	assertEquals("Factory from brest is the same", fact1, fact2);
    }
    
    @Test
    public void twoPizzaFactoryStrasBourgAreTheSame () {
    	PizzaFactory fact1 = PizzaFactoryBrest.getInstance();
    	PizzaFactory fact2 = PizzaFactoryBrest.getInstance();
    	assertEquals("Factory from brest is the same", fact1, fact2);
    }
    
    @Test
    public void twoPizzaFactoryFromDifferentFactoryAreNotTheSame() {
    	PizzaFactory fact1 = PizzaFactoryStrasbourg.getInstance();
    	PizzaFactory fact2 = PizzaFactoryBrest.getInstance();
    	assertNotEquals("Factory from brest is different of factory from Strasbourg", fact1, fact2);
    }
}
