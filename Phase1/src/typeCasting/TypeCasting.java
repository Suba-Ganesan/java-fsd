package typeCasting;

public class TypeCasting {

public static void main(String[] args) {
		
		//implicit conversion
		System.out.println("Implicit Type Casting");
		char a='A';
		System.out.println("Value of a: "+a);
		
		int b=a;
		System.out.println("Value of b: "+b);
		
		long c=a;
		System.out.println("Value of c: "+c);
		
		float d='C';
		System.out.println("Value of d: "+d);
		
		double e=7f/2f;
		System.out.println("Value of e: "+e);
				
		System.out.println("\n");
		
		//explicit conversion
		System.out.println("Explicit Type Casting");
		double x=66.6;
		int y=(int)x;
		System.out.println("Value of x: "+y);
		
		byte t=(byte)x;
		System.out.println("Value of t: "+t);
		
		char z=(char)x;
		System.out.println("Value of z: "+z);
		
	}

}
