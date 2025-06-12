package myfirstpackage;

public class PrimeNumbersDivisibleBy3And5 {

	public static void main(String[] args) {
		System.out.println("Numbers between 1 and 100 divisible by both 3 and 5:");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
	}

}
}
