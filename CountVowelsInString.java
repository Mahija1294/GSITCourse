package myfirstpackage;

public class CountVowelsInString {

	public static void main(String[] args) {
		String S1 = "Hello how are you doing today?";
		int count = 0;
		for (int i=0; i<S1.length(); i++)
		{
			char S2 = S1.charAt(i);
			if(S2 == 'a' || S2 == 'e' || S2 == 'i' || S2 == 'o' || S2 == 'u') 
			{
				count++;
			}
		}
				System.out.println("Total Number of Vowels : " +count);		

	}

}
