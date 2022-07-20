package InnerClass;

public class sample2 {

	private String msg = "Inner Classes";

	void display() {
		class Inner {
			void msg() {
				System.out.println(msg);
			}
		}

		Inner l = new Inner();
		l.msg();
	}

	public static void main(String[] args) {
		sample2 ob = new sample2();
		ob.display();
	}
}
