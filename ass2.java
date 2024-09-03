package minal_java;
import java.util.Scanner;//Write the program to calculate the simple interest and compound interest
public class ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     si();
	}
   public static void si()
   {
	    float p,r,t,simple,ci;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the principle:");
	    p=sc.nextFloat();
	    System.out.println("Enter the rate:");
	    r=sc.nextFloat();
	    System.out.println("Enter the time of year:");
	    t=sc.nextFloat();
	    simple=(p*r*t)/100;
	    System.out.println("Simple Interest is="+simple);
	    ci=p*(1+(r/100)*t)-p;
        System.out.println("compund Interest is="+ci);
   }
   
}
