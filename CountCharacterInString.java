package myfirstpackage;

public class CountCharacterInString {

	public static void main(String[] args) {
        String S1 = "banana";
        int count = 0;
		for (int i=0; i<S1.length(); i++)
		{
			char S2 = S1.charAt(i);
			if( S2 == 'a') 
			{
				count++;
			}
		}
				System.out.println("Total Number of A's : " +count);
        
	}

}
