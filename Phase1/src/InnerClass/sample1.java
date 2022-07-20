package InnerClass;

public class sample1 {


	 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		sample1 obj=new sample1();
		sample1.Inner in=obj.new Inner();  
		in.hello();  
	}

}

