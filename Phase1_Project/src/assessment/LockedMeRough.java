package assessment;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;

public class LockedMeRough {
	public static void main(String[] args) throws InputMismatchException {
		ArrayList<String> newarr = new ArrayList<String>(); // empty arraylist to perform UI operations
		System.out.println("\n**************************************\n");
		System.out.println("\tWelcome to LockedMe.com \n"); // welcome display
		System.out.println("**************************************\n");
		System.out.println("   Developer\t: Suba G \n   Company\t: Lockers Pvt.Ltd.\n ");
		System.out.println("**************************************\n");
		optionsSelection(newarr);// calling the function
	}

	private static void optionsSelection(ArrayList<String> newarr) {
		System.out.println("\tMAIN MENU\n\t=========");
		ArrayList<String> arrlist = new ArrayList<String>(); // arraylist contains some file names
		arrlist.add("adobe.pdf");
		arrlist.add("data.txt");
		arrlist.add("test.txt");
		arrlist.add("client.doc");
		arrlist.add("server.xlsx");
		String[] arr = { "1. To view current Files", "2. User Interface operations", "3. Close the application" };
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);// display the Main menu
		}
		System.out.println("\nEnter your option:\t");
		Scanner sc = new Scanner(System.in);
		int options = sc.nextInt();// taking user input
		switch (options) {
		case 1:// sort files in ascending order
			if (newarr.isEmpty()) {
				TreeSet<String> ts = new TreeSet<String>(arrlist);
				System.out.println("Existing File names:");
				System.out.println(ts + "\n");
			} else {
				TreeSet<String> ts = new TreeSet<String>(newarr);

				System.out.println("Existing File names:");
				System.out.println(ts + "\n");
			}
			optionsSelection(newarr);
			break;
		case 2:// UI start
			while (true) {
				System.out.println("**************************************\nUSER INTERFACE OPERATIONS :\n");
				String[] arr2 = { "1. Add a File", "2. Delete a File", "3. Search for a File", "4. Go to Main Menu" };
				for (int j = 0; j < 4; j++) {
					System.out.println(arr2[j]);
				}
				System.out.println("\nEnter your option:\t");
				int in = 0;
				Scanner scan = new Scanner(System.in);
				try {
					in = scan.nextInt();// user input
				} catch (Exception e) {// InputMismatchException occurred
				}
				switch (in) {
				case 1:// add a file
					System.out.println("Enter the name of a file to be added: ");
					Scanner a = new Scanner(System.in);
					String addfile = a.nextLine();
					newarr.add(addfile); 
					if (newarr.size()==1) {
						arrlist.addAll(newarr);// appending the values from newarr to arrlilst
						System.out.println(new LinkedHashSet(arrlist)); //shows the unique values
					} else {
						arrlist = newarr;
						System.out.println(arrlist);
					}
					System.out.println("File '" + addfile + "' is updated\n");
					break;
				case 2:
					// delete a file
					System.out.print("Enter the name of a file to be deleted: \n");
					Scanner d = new Scanner(System.in);
					String deletefile = d.nextLine();
					// if(newarr.size()!=1)
					// {
					if (arrlist.contains(deletefile)) {
						arrlist.remove(deletefile);
						System.out.println(new LinkedHashSet(arrlist));
						System.out.println("File '" + deletefile + "' deleted successfully!\n");
					} else {
						System.out.println("Sorry,File cannot be deleted(File Not Found)\n");

					}

					break;

				case 3:
					// search a file
					System.out.print("Enter the name of a file to be Searched: \n");
					Scanner s = new Scanner(System.in);
					String searchfile = s.nextLine();
					if (arrlist.contains(searchfile)) {
						System.out.println("File '" + searchfile + "' is found\n");
					} else {
						System.out.println("Sorry,File '" + searchfile + "' not found\n");
					}
					break;
				case 4:
					optionsSelection(arrlist);// call by value
					break;
				default:
					System.out.println("\n Opps! Invalid Input,Re-do the process\n");
					break;
				}// UI end;
			}
		case 3:
			System.out.println("Closing your application... \nThank you!");
			break;
		default:
			System.out.println("invalid option");
			break;
		}
	}
}
