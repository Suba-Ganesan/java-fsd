package Methods;

public class OverLoading {

	public void m1(int a, int b) {
		System.out.println("a+b= "+(a+b));
	}

	public void m2(int c) {
		System.out.println("2c= "+2*c);
	}

	public static void main(String args[]) {

		OverLoading ob = new OverLoading();
		ob.m1(10, 12);
		ob.m2(5);
	}
}
