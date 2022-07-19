package pack1;

public class parent extends AccessSpecifier {
	protected void dis1()//protected
	{
		System.out.println("protected access specifier-parent");
		m1();
	}
	
	public void dis2() //public 
	{
		System.out.println("public access specifier-parent");
	}
}
