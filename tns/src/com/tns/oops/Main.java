package com.tns.oops;

class Animals {
	void eat() {
		System.out.println("all animals eat");
	}
}

class Dog extends Animals{
	void barks() {
		System.out.println("the dog barks");
	}
}

public class Main {
	public static void main(String args[]) {
	   Dog ob = new Dog();
	   ob.eat();
	   ob.barks();
    }
}
