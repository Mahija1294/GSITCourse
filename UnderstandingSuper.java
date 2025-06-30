package myfirstpackage;

class Parent
{
	int a = 10;
	
	void NewMethod()
	{
		System.out.println("Parent class method");
	}
	
	Parent()
	{
		System.out.println("Parent constructor called");
	}
	
	Parent(int a)  // 40
	{
		this.a = a;
	}
}

class Child extends Parent
{
	int a = 20;
	
	void NewMethod()
	{
		System.out.println("Child class method");
	}
	
	void displayVariable()
	{
		System.out.println(this.a);   // 40
		System.out.println(super.a);  // 40 
		super.NewMethod();
	}
	
	Child()
	{
		System.out.println("Child constructor called");
	}
	
	Child(int a, int b)
	{
		super(b);     // calling a constructor of a parent class
		this.a = a;
	}
}

public class UnderstandingSuper {

	public static void main(String[] args) {
		Child C = new Child();
//		C.NewMethod();
//		
//		C.displayVariable();
//		
		Child C2 = new Child(40, 60);
		C2.displayVariable();
	}

}
