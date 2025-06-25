package myfirstpackage;

public class ImmutableStrings {

	public static void main(String[] args) {
		String s1 = "Java";
	     String s2 = "Java";
	     String s3 = new String("Java");

	        System.out.println(s1 == s2);        // true
	        System.out.println(s1 == s3);        // false
	        System.out.println(s1.equals(s3));   // true
		
		
		String s4 = "hello";
		s4 = "hello world";
		System.out.println(s4);
		
		String s5 = "hello";
		s5.concat("world");
		System.out.println(s5);
	

	}

}
