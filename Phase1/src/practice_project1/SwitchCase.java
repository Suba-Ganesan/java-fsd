package practice_project1;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		double a = sc.nextDouble();
		System.out.println("enter second number");
		double b = sc.nextDouble();
		System.out.println("enter the operator\n (+\t-\t*\t%)\n");
		char op = sc.next().charAt(0);

		double res = 0;
		switch (op) {
		case '+':
			res = a + b;
			break;
		case '-':
			res = a - b;
			break;
		case '*':
			res = a * b;
			break;
		case '%':
			res = a / b;
			break;
		default:
			System.out.println("invalid");
			break;
		}
		System.out.println("answer is= " + res);
	}

}
