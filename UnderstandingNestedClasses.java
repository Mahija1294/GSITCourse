package myfirstpackage;

public class UnderstandingNestedClasses {
	
	int x = 10;
	static int y = 20;
	
	class NewClass          //Non static nested class
	{
		void newMethod()
		{
			System.out.println("Nested class called");
		}
	}
	
	static class ANewStaticClass  //Static class
	{
		static void newMethod2()
		{
			System.out.println(y);
		}
		
		void newMethod3()
		{
			System.out.println(y);
		}
	}
	
	void newMethod()
	{
		class localClass // Local Class
		{
			void display()
			{
				System.out.println("Display in local class called " + x);
			}
		}
		
		localClass li = new localClass();
		li.display();
	}

	public static void main(String[] args) {
		UnderstandingNestedClasses obj = new UnderstandingNestedClasses();
		UnderstandingNestedClasses.NewClass Obj2 = obj.new NewClass();
		
		Obj2.newMethod();
		
		obj.newMethod();
		
		UnderstandingNestedClasses.ANewStaticClass obj3 = new UnderstandingNestedClasses.ANewStaticClass();

	}

}
