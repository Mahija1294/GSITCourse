package myfirstpackage;

public class UnderstandingVariables { 
	int c = 50;         
	static int d = 70;

	public static void main(String[] args) {
		int a = 10;                
		System.out.println(a);
		
		UnderstandingVariables obj1 = new UnderstandingVariables();
		System.out.println(obj1.c);
		System.out.println(UnderstandingVariables.d);
		
		NewMethod();
	}
	
	public static void NewMethod()
	{
		int a = 20;                
		System.out.println(a);
		UnderstandingVariables obj1 = new UnderstandingVariables();
		System.out.println(obj1.c);
		System.out.println(UnderstandingVariables.d);
	}

}
