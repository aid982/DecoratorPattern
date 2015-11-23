package com.osetskiy;

public class Sugar extends CondimentDecorator {
	Beverage beverage;	
	public String description() {		
		return beverage.description()+", Sugar ";
	}

	public Sugar(Beverage beverage) {
		super();
		this.beverage = beverage;
	}	
	public int cost() {
		return 10+beverage.cost();
	
	}
	

}
