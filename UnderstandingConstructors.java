package myfirstpackage;

class Student
{
	String name;    
	int age;
	int id;
	
	Student()    //Non param constructor
	{
		System.out.println("Constructor called..." );
	}
	
	Student(String name, int age, int id)    // paramterized constructor 
	{
		this.name = name;
		this.age = age;
		this.id = id;
		System.out.println("Parametrized constructor is called" );
	}
	
	
	Student(Student s) //copy constructor
	{
		this.name = s.name;
		this.age = s.age;
		this.id = s.id;
		System.out.println("Copy constructor is called");
	}
	
	void printInfo()
	{
		System.out.println(name + " " + age + " " + id);
	}
	
	
}

public class UnderstandingConstructors {
	
	

	public static void main(String[] args) {
		Student S1 = new Student(); 
		S1.name = "Ankush";
		S1.age = 27;
		S1.id = 1;
		
		S1.printInfo();
		
		Student S2 = new Student("Chirag", 26, 2);
		S2.printInfo();
		
		Student S3 = new Student(S2);
		S3.printInfo();
	}

}
