package Methods;

public class CallByValue {

int a=5;

void method(int a) {
	a-=5;
	System.out.println(a);
}

public static void main(String args[]) {
	CallByValue d = new CallByValue();
	System.out.println("Before operation "+d.a);
	d.method(5);
	System.out.println("After operation "+d.a);
	}
}
