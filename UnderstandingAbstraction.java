package myfirstpackage;

abstract class Animal
{
	// abstract method - abstract method is method which doesn't have any implementation -- definition -- no body
	
	abstract void sound();// no body it is just an idea
	
	void sleep()
	{
		System.out.println("Animal is sleeping");
	}
}


class Dog extends Animal
{
	@Override
	void sound() {
		System.out.println("Dog barks");
	}
}

class Cat extends Animal
{
	@Override
	void sound() {
		System.out.println("Meow");
	}	
}

public class UnderstandingAbstraction {

	public static void main(String[] args) {
		Animal A1 = new Dog();
		A1.sound();
	
		Animal A2 = new Cat();
		A2.sound();
	}

}
