package pack1;

class AccessSpecifier
{
	void m1() // default
	{
		System.out.println("you are calling defalut access specifier");
	}
	
	private void m2() //private 
	{
		System.out.println("you are calling private access specifier");
	}
	
	public void m3() //public 
	{
		System.out.println("you are calling public access specifier");
	}
	
	protected void m4() //protected 
	{
		System.out.println("you are calling protected access specifier");
		m2();
	}
	
}

public class local {

	public static void main(String[] args) {
		AccessSpecifier ac = new AccessSpecifier();
		ac.m1();
		//as.m2();
		ac.m3();
		ac.m4();
		

	}
}
