package myfirstpackage;

class Car{
	String brand;    //state of the Car class   
	int speed;      //state of the Car class
	int numberOfSeats;       
	
	void drive()       //method - behaviour of the Car 
	{
		System.out.println("Car of " + brand + " is running with the "+ speed + " and has " + numberOfSeats + " number of seats");
	}
	
	void applyBrakes()
	{
		System.out.println("Car stopped");
	}
	
	
	
}

public class UnderstandingOops {

	public static void main(String[] args) {
		Car C1 = new Car();  
		C1.brand = "Maruti";
		C1.numberOfSeats = 5;
		C1.speed = 60;	
		C1.drive();
		C1.applyBrakes();
		
		Car C2 = new Car();
		C2.brand = "Tata";
		C2.numberOfSeats = 7;
		C2.speed = 80;
		C2.drive();
		C2.applyBrakes();
		
		
	}

}
