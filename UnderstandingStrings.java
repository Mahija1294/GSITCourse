package myfirstpackage;

public class UnderstandingStrings {

	public static void main(String[] args) {
		String s1 = "Hello";
		System.out.println(s1);
		
		//1. using new keyword
		String s2 = new String("World"); 
		System.out.println(s2);
		
		//2. String length
		System.out.println(s2.length());
		
		//3. CharAt()
		System.out.println("Char at index 2 is " + s2.charAt(2));
		
		//4. subString()
		System.out.println("Substring from index 2 is " + s1.substring(2));
		System.out.println("Substring from index 0 till 4 is " + s1.substring(0,4));
		
		//5. to upper case and to lower case
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		// 6. trim
		String s3 = "  Hello World   ";
		System.out.println(s3.trim());
		
		// 7. equals() and equalsIgnoreCase()
		System.out.println("s1 is equal to hello: " + s1.equals("hello"));
		System.out.println("s1 ignoring case to hello: " + s1.equalsIgnoreCase("hello"));
		
		String first = "Hello";
		String second = new String("Hello");
		if(first == second)
			System.out.println(true);
		else
			System.out.println(false);
		
		
		// 8. contains, startsWith, endsWith
		System.out.println("s1 contains 'ell' : " + s1.contains("ell"));
		System.out.println("s1 starts with 'ell' : " + s1.startsWith("Hell"));
		System.out.println("s1 starts with 'llo' : " + s1.endsWith("llo"));
		
		// 9. indexOf(), lastIndexOf()
		System.out.println("Index of o in S1 is: "+ s1.indexOf('o'));
		System.out.println("Last index of l in s1 is: " + s1.lastIndexOf('l'));
		
		
		//10. replace()
		System.out.println("Replace 'o' with 'i'" + s1.replace('o', 'i'));
		
		//11. Concatenation
		String s4 = s1 + " " + s2;
		System.out.println(s4);
		System.out.println(s1.concat(" World"));
		
		//looping through characters
		for(int i=0;i<s1.length();i++)
		{
			System.out.println("Character At " + i + " position is " + s1.charAt(i));
		}
		
		
		//13. calculate vowels count
		
		String s5 = "Checking vowels are present or not";
		int count = 0;
		for(int i=0;i<s5.length();i++)
		{
			char currentCharacter = s5.charAt(i);
			if(currentCharacter == 'a' || currentCharacter=='e' ||
					currentCharacter == 'i' || currentCharacter=='o'
					|| currentCharacter == 'u')
			{
				count++;
			}
		}
		System.out.println("vowels count is: " + count);
		
	}

}
