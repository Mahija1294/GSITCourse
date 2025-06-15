package myfirstpackage;

class NewClass
{
	int a = 20;       
	static int b = 40;  
}


public class UnderstandingStaticVariables { 

	public static void main(String[] args) {
		NewClass Obj1 = new NewClass();
		System.out.println(Obj1.a);
		System.out.println(Obj1.b);
		
		NewClass Obj2 = new NewClass();
		System.out.println(Obj2.a);
		System.out.println(Obj2.b);
		
  
		
		Obj1.b = 50; 
		System.out.println(Obj1.b); 
		System.out.println(Obj2.b);
	}

}
