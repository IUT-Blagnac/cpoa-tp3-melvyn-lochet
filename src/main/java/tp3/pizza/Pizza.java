package tp3.pizza;

import java.util.ArrayList;

public abstract class Pizza {
	
	protected String name;
	protected String crust;
	protected String sauce;
	protected ArrayList garnitures;
	
	
	public void prepare() {
		System.out.println(String.format("Preparation of Pizza %s", this.name));
		
		System.out.println(String.format("Spread the pizza dough : %s", this.crust));
		
		System.out.println(String.format("Add the sauce : %s", this.sauce));
		
		System.out.println("Add the garnitures :");
		for(Object gar : this.garnitures) {
			System.out.println(String.format("  %s", gar.toString()));
		}
		
	}

	public void bake() {
		System.out.println("Bake 25 minutes at 180°");
	}

	public void cut() {
		System.out.println("Cut the pizza in triangles");
	}

	public void wrap() {
		System.out.println("Put the pizza in the official box");
	}
	
	public String getName() {
		return this.name;
	}
}
