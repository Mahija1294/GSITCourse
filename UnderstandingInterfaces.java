package myfirstpackage;

interface vehicle
{
	void start();
}

class Car implements vehicle
{
	public void start()
	{
		System.out.println("Car started");
	}
}

public class UnderstandingInterfaces {

	public static void main(String[] args) {
		vehicle C1 = new Car();
		C1.start();
	}

}
