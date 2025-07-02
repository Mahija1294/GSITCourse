package myfirstpackage;

//Public method inside interfaces - possible - by default all methods are public
//private methods inside interfaces - possible
//protected methods inside interfaces - NOT allowed in interface
//default - not possible
//static methods - possible
//static abstract methods - not possible
//final abstract methods - not possible


interface Payment   //public contracts for child classes
{
	void makePayment(double amount);  
	default void publicMethod()   //public
	{
		privateMethod();  // utilize private methods are helper functions for interfaces
	}
	
	private void privateMethod()
	{
		System.out.println("Private method");
	}
	
	static void staticMethod() //public method 
	{
		System.out.println("Static method");
	}
}

class CreditCardPayment implements Payment
{
	@Override
	public void makePayment(double amount) {
		System.out.println("Credit card payment completed...");
	}
}



class UPIPayment implements Payment
{
	@Override
	public void makePayment(double amount) {
		System.out.println("UPI Payment completed...");	
	}
}


public class InterfaceOneMoreExample {

	public static void main(String[] args) {
		Payment P1 = new CreditCardPayment();
		P1.makePayment(0);
		
		Payment P2 = new UPIPayment();
		P2.makePayment(0);
		
		Payment.staticMethod();
	}

}
