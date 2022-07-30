package Practice_Project3;

import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class ReadFile {
	String str;

//read
	ReadFile() {
		try {
			File f1 = new File("file1.txt");
			if (!f1.exists())
				f1.createNewFile();
			FileReader fl = new FileReader(f1);
			BufferedReader bf = new BufferedReader(fl);
			// For reading the content
			while ((str = bf.readLine()) != null) {
				System.out.println(str);
			}
			fl.close();
		} catch (Exception e) {
			System.out.println("Error : ");
			e.printStackTrace();
		}
	}

}

public class FileHandling {

	public static void main(String args[]) throws IOException {

		System.out.println("select one of the below operations:\nW for write mode\nR for read mode\nA for append mode");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		if (s.equalsIgnoreCase("R")) {
			ReadFile read = new ReadFile();

		} else if (s.equalsIgnoreCase("W") || s.equalsIgnoreCase("A")) {
			WriteOrAppendToFile(s);
		} else {
			System.out.println("INVALID mode");
		}
		scan.close();
	}

	static void WriteOrAppendToFile(String s) {
		String str1;
		FileWriter fw;
		try {

			File f = new File("file1.txt");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			// writing new Content every time you run
			if (s.equalsIgnoreCase("W")) {
				fw = new FileWriter(f);
				System.out.println("I'm aware of content will be over write");
				System.out.println("'YES'\t 'NO'");
				Scanner sc = new Scanner(System.in);
				String s1 = sc.nextLine();
				if (s1.equalsIgnoreCase("no"))
					System.exit(0);
				System.out.println("Type 'SAVE' when you stop writing file ");
				f.delete();
				f.createNewFile();
				while (!(str1 = br.readLine()).equalsIgnoreCase("save")) {
					fw.write(str1 + System.lineSeparator());

				}
				sc.close();
			}

			// append
			else {
				fw = new FileWriter(f, true);
				System.out.println("Type 'SAVE' when you stop writing file ");
				while (!(str1 = br.readLine()).equalsIgnoreCase("save")) {
					fw.append(str1 + System.lineSeparator());
				}
			}
			fw.close();
		} catch (Exception e) {
			System.out.println("Error : ");
			e.printStackTrace();
		}
	}
}
