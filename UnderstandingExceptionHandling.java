package myfirstpackage;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class UnderstandingExceptionHandling {

	public static void main(String[] args) {
		//Multiple catch blocks -- child should be before parent opposite not allowed
				try
				{
					int a = 10/0;
				}
				catch(ArithmeticException e)   //Run Time Exception
				{
					System.out.println("Exception has occur: " + e);
				}
				catch(Exception e2)
				{
					System.out.println("Second Exception block");
				}
				
				System.out.println("Further Execution");
				
				
				//NullPointerException
				String str = null;		
				try
				{
					System.out.println(str.length()); //Run time exception 
				}catch(Exception e)
				{
					System.out.println(e);
				}finally
				{
					System.out.println("Finally is executed");
				}
			
				//Finally block
				System.out.println(testFinally());
				testFinally();
				
				//throw
				throwException();
				setAge(-3);
				
				//Throws
				try
				{
					understandingThrows();
				}catch(ArithmeticException e)
				{
					System.out.println(e.getMessage());
				}
				
				//Checked Exception - should be handled always
				try {
					readFile_HandleInCallingMethod();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				
				readFile();
				
				//Error
				recursion();
				
				
				//Exception inside finally
				try
				{
					int a =10/0;
				}catch(Exception e)
				{
					System.out.println(e.getMessage());
				}finally
				{
					try
					{
						String str2 = null;
						System.out.println(str2.length());
					}catch(Exception e)
					{
						System.out.println(e.getMessage());
					}finally
					{
						System.out.println("Always execute");
					}
				}
					
			}
			
			public static void recursion()  // Error
			{
				try
				{
					recursion();  // StackOverFlowError
				}
				catch(Throwable t) // Can use Error or Throwable to catch errors
				{
					System.out.println(t);
				}	
			}
			
			
			public static void readFile() 
			{
				try {
					FileReader file = new FileReader("filename.txt");  //compile time exception or checked exceptions
				}
				catch (FileNotFoundException e) {
					e.printStackTrace();
				} 
			}
			
			public static void readFile_HandleInCallingMethod() throws FileNotFoundException
			{
					FileReader file = new FileReader("filename.txt");  
			}
			
			public static void understandingThrows() throws ArithmeticException
			{
				int a = 10/0;
				System.out.println("Throws");
			}
			
			public static void throwException()
			{
				throw new ArithmeticException();
			}
			
			public static void setAge(int age)
			{
				if(age<0)
					throw new IllegalArgumentException("Invalid age");
				System.out.println("Age is: " + age);	
			}
			
			public static int testFinally()
			{
				try
				{
					System.out.println("Try block executed");
					return 2;
				}
				finally
				{
					System.out.println("Finally executed");
				}		
			}
			
			

		}



		//compile time exception - java will give you error - handle this 
		//Errors are meant to be fixed not handled ---- 

		//Checked exception - compile time exception - should be handled