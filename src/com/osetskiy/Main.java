package com.osetskiy;

public class Main {

	public static void main(String[] args) {
		Beverage coffee = new Coffee();
		coffee = new Lemon(coffee);
		coffee = new Sugar(coffee);
		System.out.println("Cost : "+ coffee.description());
		System.out.println("Cost : "+ coffee.cost());
		

	}

}
