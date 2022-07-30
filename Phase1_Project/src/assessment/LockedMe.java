package assessment;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.File;
import java.io.IOException;

public class LockedMe {
	public static File f = new File("D:\\samplefolder");

	public static void main(String[] args) throws IOException {
		System.out.println("**************************************\n");
		System.out.println("\tWelcome to LockedMe.com \n"); // welcome display
		System.out.println("**************************************\n");
		System.out.println("   Developer\t: Suba G \n   Company\t: Lockers Pvt.Ltd.\n ");
		System.out.println("**************************************\n");
		try {
			optionsSelection();// calling the function
		} catch (Exception e) {
			System.out.println("you entered an invalid option");
		}
	}

	private static void optionsSelection() throws IOException {
		System.out.println("\tMAIN MENU\n\t=========");
		String[] arr = { "1. To view current Files", "2. User Interface operations", "3. Close the application" };
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);// display the Main menu
		}
		System.out.println("\nEnter your option:\t");
		try (Scanner sc = new Scanner(System.in)) {
			int options = sc.nextInt();
			switch (options) {
			case 1:// sort files in ascending order
				File files[] = f.listFiles();
				Arrays.sort(files);
				for (int i = 0; i < files.length; i++)
					System.out.println(files[i].getName());
				optionsSelection();// calling the function
				break;
			case 2:// UI start
				while (true) {
					System.out.println("**************************************\nUSER INTERFACE OPERATIONS :\n");
					String[] arr2 = { "1. Add a File", "2. Delete a File", "3. Search for a File",
							"4. Go to Main Menu" };
					for (int j = 0; j < 4; j++) {
						System.out.println(arr2[j]);
					}
					System.out.println("\nEnter your option:\t");
					int scan = sc.nextInt();
					switch (scan) {
					case 1:// add a file
						System.out.println("Enter the name of a file to be added: ");
						String addnewfile = sc.next();
						File file1 = new File(f, addnewfile);
						file1.createNewFile();
						System.out.println("File '" + addnewfile + "' is updated\n");
						break;
					case 2:// delete a file
						System.out.println("Enter the name of a file to be deleted: \n");
						String deletefile = sc.next();
						boolean val1 = false;
						File file2[] = f.listFiles();
						for (int i = 0; i < file2.length; i++) {
							if (file2[i].getName().startsWith(deletefile)) {
								val1 = true;
								file2[i].delete();
								System.out.println("File '" + deletefile + "' deleted successfully!\\n");
							}
						}
						if (val1 == false) {
							System.out.println("Sorry,File cannot be deleted(File Not Found)\\\\n");
						}
						break;
					case 3:// search a file
						System.out.println("Enter the name of a file to be Searched: \\n");
						String searchfile = sc.next();
						boolean val2 = false;
						File arr1[] = f.listFiles();
						for (int i = 0; i < arr1.length; i++) {
							if (arr1[i].getName().startsWith(searchfile)) {
								val2 = true;
								System.out.println("File '" + searchfile + "' is found\n");
							}
						}
						if (val2 == false) {
							System.out.println("No file found in the Directory");
						}
						break;
					case 4:
						optionsSelection();
						System.exit(0);
					default:
						System.out.println("\\n Opps! Invalid Input,Re-do the process\\n");
					}
				}

			case 3:
				System.out.println("Closing your application... \nThank you!");
				break;
			default:
				System.out.println("\\n Opps! Invalid Input,Re-do the process\\n");
				optionsSelection();
				break;
			}
		}
	}
}