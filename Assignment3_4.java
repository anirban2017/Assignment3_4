package Assignment3_4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Assignment3_4 {
	static int roll_no; /* Declare the global variables*/
	private String name;
        private String Fathername;
        private String Address;
        private String Stream;
	private float marks;
	static final String course="AcadgildJava";
	BufferedReader br;

	Assignment3_4()throws IOException //Constructor for Initialize the Variables
	{
	br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Student's name");
	name=br.readLine();
        System.out.println("Enter Father's name");
	Fathername=br.readLine();
        System.out.println("Enter Student's Address");
	Address=br.readLine();
        System.out.println("Enter Student's Stream");
	Stream=br.readLine();
       	System.out.println("Enter Total marks");
	marks=Float.parseFloat(br.readLine());
	}
	public void display()  // method to display Student's Data
	{
	System.out.println(++roll_no +" "+name+" "+Fathername+" "+Address+" "+Stream+" "+marks+" "+course);
	}
	
	public static void main(String s[])throws IOException
	{
                
          int n;
          BufferedReader br1;
          br1=new BufferedReader(new InputStreamReader(System.in));
try{
          System.out.println("Enter the number of Students:-"); 
          n=Integer.parseInt(br1.readLine());
          for(int j=1; j<=n; j++)
          {
new Assignment3_4().display();
          }
}
catch(Exception e)
{System.out.println("Something Wrong there.");
System.out.println("Try Again...");
}
          

		
	}

}

