package practice_project1;

import java.util.Scanner;

public class IfCondition {

	static void cal(double x, double y, int z) {

		if (z == 1)
			System.out.println("Answer is= " + (x + y)); // add
		if (z == 2)
			System.out.println("Answer is= " + (x - y)); // sub
		if (z == 3)
			System.out.println("Answer is= " + (x * y)); // mul
		if (z == 4)
			System.out.println("Answer is= " + (x / y)); // div

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		double a = sc.nextDouble();
		System.out.println("enter second number");
		double b = sc.nextDouble();
		System.out.println("options\n1. +\n2. -\n3. *\n4. %\n");
		System.out.println("select the option");
		int c = sc.nextInt(); // selecting options
		cal(a, b, c);
	}

}
