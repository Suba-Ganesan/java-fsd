package Constructor;

class EmpInfo{
	int age;
	String name;

void display() {
	System.out.println(name+"'s age is "+age);
	}
}

public class DefaultConstructor {

public static void main(String[] args) {

	EmpInfo emp1=new EmpInfo();
	EmpInfo emp2=new EmpInfo();

	emp1.display();
	emp2.display();
	}
}
