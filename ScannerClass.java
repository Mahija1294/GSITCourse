package myfirstpackage;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println(name + " " + age);
		sc.close();

	}

}
