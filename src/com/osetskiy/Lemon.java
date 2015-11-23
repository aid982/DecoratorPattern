package com.osetskiy;

public class Lemon extends CondimentDecorator {
	Beverage beverage;
	
	
	
	
	
	public String description() {		
		return beverage.description()+", Lemon ";
	}


	public Lemon(Beverage beverage) {
		super();
		this.beverage = beverage;
	}


	@Override
	public int cost() {
		return 10+beverage.cost();
	
	}
	

}
