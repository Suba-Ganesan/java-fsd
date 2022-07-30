package Practice_Project2;
//import java.util.ArrayList;
//import java. util. Scanner;
import java.util.*;
public class SearchEmail {

   public static void main(String[] args){
	   int count=0;
      ArrayList <String> emplist = new ArrayList<String>();
      
      emplist.add("siva@gmail.com");
      emplist.add("sun@gmail.com");
      emplist.add("bob@gmail.com");
      emplist.add("kavin@gmail.com");
      emplist.add("kaviya@gmail.com");
      emplist.add("mani@gmail.com");
      emplist.add("niroop@gmail.com");
      emplist.add("sunaina@gmail.com");
      emplist.add("raj@gmail.com");
      emplist.add("varun@gmail.com");
      emplist.add("sivadharshini@gmail.com");
      emplist.add("nagu@gmail.com");
      
      System.out.println("Enter the mail id to search");
      Scanner sc= new Scanner(System.in);
      String in=sc.nextLine();
      System.out.println("..............");
      for (String element : emplist){
         if (element.contains(in))
         {
               System.out.println(element);
         	   count++;
         }
      }
      if(count==0)
   	   System.out.println("No Search Found");
   }
   
	   
}