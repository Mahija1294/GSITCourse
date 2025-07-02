package myfirstpackage;

interface A
{
	int MAX = 10;   // public static final
	default void newMethod()
	{
		System.out.println("New method of interface A called");
	}
	default void newMethod3()
	{
		System.out.println("New method 3 called");
	}
}

interface B
{
	int MAX = 20;
	default void newMethod()
	{
		System.out.println("New method of interface B called");
	}
}


class C implements A, B
{

	
	public void newMethod()   
	{
		A.super.newMethod();
		B.super.newMethod();
	}
	
	void newMethod2()
	{
		System.out.println("NewMethod2 from Class C");
		A.super.newMethod();
	}
	
	public void newMethod3()
	{
		System.out.println("Method 3 from child called...");
		A.super.newMethod3();
		System.out.println(A.MAX);
		System.out.println(B.MAX);
	}
}

public class DiamondProblem {

	public static void main(String[] args) {
		A C1 = new C();
		C1.newMethod3();
		
		C C2 = new C();
		C2.newMethod2();
		
		C1.newMethod();

	}

}
