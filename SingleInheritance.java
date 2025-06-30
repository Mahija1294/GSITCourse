package myfirstpackage;

class Vehicle
{
	void run()
	{
		System.out.println("Vehicle is running...");
	}
}

class Car extends Vehicle
{
	void runCar()
	{
		System.out.println("Car is running... ");
	}
}

class Innova extends Car
{
	void runInnova()
	{
		System.out.println("Innova is running..");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Car C1 = new Car();
		C1.run();
		
		Innova IN = new Innova();
		IN.run();
		IN.runCar();
		IN.runInnova();

	}

}