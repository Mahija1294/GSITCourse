package myfirstpackage;

public class UnderstandingMethods { 
	static int doAddition(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		int sumInMain = doAddition(10, 10);
		int totalSum = sumInMain + 10;
		
		System.out.println(totalSum);

	}

}
