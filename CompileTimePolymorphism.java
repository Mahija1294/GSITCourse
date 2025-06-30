package myfirstpackage;

class Calculator
{
	int add(int a, int b)
	{
		return a+b;
	}
	
	
	double add(double a, double b)
	{
		return a+b;
	}
	
	int add(int a, int b, int c)
	{
		return a+b+c;
	}
}

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		Calculator Calc = new Calculator();
		System.out.println(Calc.add(2,5));
		System.out.println(Calc.add(1.5,2.5));
		System.out.println(Calc.add(2,4,6));


	}

}
