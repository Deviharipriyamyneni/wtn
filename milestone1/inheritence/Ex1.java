package com.wipro.inheritence;

class Animal{
	void eat()
	{
		System.out.println("Animal eats");
	}
	void sleep()
	{
		System.out.println("Animals sleeps");
	}
}
class Bird extends Animal{
	void eat()
	{
		System.out.println("Bird eats");
	}
	void sleep()
	{
		System.out.println("Bird sleeps");
	}
	void fly()
	{
		System.out.println("Bird flys");
	}
}
public class Ex1 {
public static void main(String[] args) {
	Animal a=new Animal();
	a.eat();
	a.sleep();
	Bird b=new Bird();
	b.eat();
	b.sleep();
	b.fly();
	
}
}