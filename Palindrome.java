package myfirstpackage;

public class Palindrome {

	public static void main(String[] args) {
		int num = 129; 
		int rev = 0;
		int original = num;
		
		while(num!= 0)
		{
			int digit = num%10;    
			rev = rev*10 + digit;  
			num = num/10;         
		}
		if (original == rev) {
			System.out.println(original + " It is a palindrome");
		}
			else {
				System.out.println(original + " It is not a palindrome");
			}
		}
}

	

