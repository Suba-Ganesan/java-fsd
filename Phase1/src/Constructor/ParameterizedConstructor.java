package Constructor;

class Student{
	int age;
	String name;

	Student(String x,int y)
	{
	name=x;
	age=y;
	}

	void display() {
	System.out.println(name+"'s age is "+age);
	}
}

public class ParameterizedConstructor {

public static void main(String[] args) {

	Student s=new Student("nilan",19);
	Student s2=new Student("suba",21);
	s.display();
	s2.display();
		}
}
