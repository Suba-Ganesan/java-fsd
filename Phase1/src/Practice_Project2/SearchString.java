package Practice_Project2;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchString {

	public static void main(String[] args) {

		ArrayList<String> emplist = new ArrayList<String>();
		emplist.add("siva@gmail.com");
		emplist.add("sun@gmail.com");
		emplist.add("bob@gmail.com");
		emplist.add("kavin@gmail.com");
		emplist.add("kaviya@gmail.com");
		emplist.add("mani@gmail.com");
		emplist.add("niroop@gmail.com");
		emplist.add("sunaina@gmail.com");
		emplist.add("raj@gmail.com");
		emplist.add("varun@gmail.com");
		emplist.add("sivadharshini@gmail.com");
		emplist.add("nagu@gmail.com");
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter emailID : ");
			String searchElement = sc.nextLine();
			if (emplist.contains(searchElement)) {
				System.out.println("email ID " + searchElement + " is found");
			} else {
				System.out.println("email ID " + searchElement + " is not found");

			}

		}
	}
}
