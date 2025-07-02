package myfirstpackage;

class Students
{
	private String name = "Kritika"; 
	private int age = 25;
	
	static int getNameCount = 0;
	
	public String getName()
	{
		getNameCount++;
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		if(age<0)
			System.out.println("Invalid age");
		else
			this.age = age;
	}
	
}

public class UnderstandingEncapsulation {

	public static void main(String[] args) {
		Students S1 = new Students();
		System.out.println(S1.getName() + " " + S1.getAge());
		S1.getName();
		
		Students S2 = new Students();
		S2.getName();
		
		System.out.println(Students.getNameCount);
		
		S2.setName("Shreyas");
		System.out.println(S2.getName());
		
		
		S2.setAge(30);
		System.out.println(S2.getAge());

	}

}
