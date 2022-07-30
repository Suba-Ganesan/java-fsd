package Strings;

public class TestingStrings {

	public static void main(String[] args) {
		System.out.println("Methods of Strings:");
		
		String str = new String("happy holidays");
		// to find length
		System.out.println(str.length()); 
		
		 // substring
		System.out.println(str.substring(6));

		//compares string & print int values
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "HEMLO";
		String s4 = "flag";
		System.out.println(s1.compareTo(s4));//2 because "h" is 2 times greater than "f"
		System.out.println(s2.compareTo(s3));//-1 because "l" is 1 times lower than "m" 
		System.out.println(s1.compareTo(s2));//0 because both are equal  

		// IsEmpty
		String s5 = "";
		System.out.println(s4.isEmpty());
		System.out.println(s5.isEmpty());

		// toLowerCase
		System.out.println(s3.toLowerCase());

		// replace

		System.out.println(s3.replace('M', 'L'));
	

		// equals
		String x = "Welcome to Java";
		String y = "WeLcOmE tO JaVa";
		System.out.println(x.equals(y));

		//StringBuffer append method
		StringBuffer s = new StringBuffer("Hello user,");
		s.append(" Welcome to our page");
		System.out.println(s);

		// insert method
		s.insert(2, 'e');
		System.out.println(s);

		// replace method
		StringBuffer sb = new StringBuffer("Hello");
		sb.replace(0, 2, "hEl");
		System.out.println(sb);

		// delete method
		sb.delete(0, 1);
		System.out.println(sb);

		// StringBuilder
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1 = new StringBuilder("Happy");
		sb1.append("Learning");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(1, "Welcome"));

		System.out.println(sb1.reverse());

		// conversion
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");

	/*	String str = "Hello";

		// conversion from String object to StringBuffer
		StringBuffer sbr = new StringBuffer(str);
		sbr.reverse();
		System.out.println("String to StringBuffer");
		System.out.println(sbr);

		// conversion from String object to StringBuilder
		StringBuilder sbl = new StringBuilder(str);
		sbl.append("world");
		System.out.println("String to StringBuilder");
		System.out.println(sbl);*/
	}
}
