package myfirstpackage;

class Student
{
	String name;
	int age;
	
	Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}

public class UnderstandingArrays {

	public static void main(String[] args) {
		String name = "Shivam";
		int age = 25;
		
		int sub1 = 97;
		int sub2 = 87;
		int sub3 = 78;
		
//	DataType[] variable_name = new Dataype[count]
		
		int[] marks = new int[3]; 			//memory allocation - 12 bytes
		marks[0] = 97;
		marks[1] = 87;
		marks[2] = 78;
//		
		int[] marks2 = {97,87,78,89};   // memory allocation - 16 bytes
//		
		String[] students = {"Akshada", "Ankush", "Hemanth"};
		System.out.println(students[0]);
		System.out.println(students.length);
		System.out.println(students[students.length-1]);
//		
//		//loops - iterate through array
		for(int i=0;i<marks2.length;i++)
		{
			System.out.println(marks2[i]);
		}
//		
//		//enhanced for loop (for each)
		for(int str : marks2)
		{
			System.out.println(str);
		}
		
		
		Student S1 = new Student("Ankush", 25);
		Student S2 = new Student("Kritika", 26);
		
		Student[] Student_Array = new Student[2];
		Student_Array[0] = S1;
		Student_Array[1] = S2;
		
		for(Student str: Student_Array)
		{
			System.out.println(str.name + " " + str.age);
		}
		
		//Array of array - 2D array
		int[][] arr = {
				{1,2,3},
				{4,6,7},
				{5,6}
		};
		
		System.out.println(arr[2][1]);
		
		//iterator through 2D array
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		String[] str = new String[5];
		System.out.println(str[0]);
		//default values
		for(String s : str)
		{
			System.out.println(s);
		}

//		
//		
		int[] arr2 = {1,2,3};
//		System.out.println(arr2[3]); 	// Exception
	
		int a = 10; // primitive 
		String str2 = "Shivam";  //non primitive - String
		Integer b;   //non primitive - Reference of Integer class
		boolean c;   //primitive
		Boolean d;    //class - non primitive
		float e; //primitve
		Float f;
		
		Object[] data = {1,2,3,"Hello",false,3.0};  //Homogeneous 
		
		//1- Integer - Object
		//2- Integer - Object
		//Hello - String - Object
		//3.0 - Float - Object
		
		for(Object o:data)
		{
			System.out.println(o);
		}
			
		//Numerical primitive values - default values are 0, 0.0
		//boolean -- primitive values -- false
		//String -- non primitive -- all object -- null
			
		
		int[] Array = new int[4];
		printArray(Array);
		
		int[] new_Array = getValues();
		for(int i: new_Array)
		{
			System.out.println(i);
		}
		
		
		
	}
	
	public static void printArray(int[] arr)
	{
		for(int i:arr)
			System.out.println(i);
	}
	
	public static int[] getValues()
	{
		int[] newArray = new int[3];
		return newArray;
	}
}

	}

}
