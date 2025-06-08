package myfirstpackage;

public class ConditionalStatements {

	public static void main(String[] args) {
		int maths = 30;
	     int science= 50;
	     int english = 80;
	     
	     int total = maths+science+english;
	     int average = total/3;
	     
	     System.out.println("Total Marks : " + total);
	     System.out.println("Average : " +average);
	     
	     if (average>=90 && average<=100) {
	    	 System.out.println("Grade : A+ ");
	    	 System.out.println("Excellent Performance");
	     }	 
	     if (average>=75 && average<=89) {
	    	 System.out.println("Grade : A");
	    	 System.out.println("Excellent Performance");
	     }	 
	     if (average>=60 && average<=74) {
	    	 System.out.println("Grade : B");
	    	 System.out.println("Keep Improving");
	     }	 
	     if (average>=40 && average<=59) {
	    	 System.out.println("Grade : C");
	    	 System.out.println("Keep Improving");
	     }	 
	     if (average<40) {
	    	 System.out.println("Fail");
	     }
	     if ( maths<35 || science<35 || english>35 ) {
	    	 System.out.println("Failed due to low score in at least one subject");
	     }
	     }
	}

