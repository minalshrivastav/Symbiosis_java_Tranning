package minal_java;
import java.util.Scanner;//Write the program to calculate the area of rectangle
public class Ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      rec();
	}
 public static void rec()
 {
	 int l,b,res;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the length:");
	 l=sc.nextInt();
	 System.out.println("enter the width:");
	 b=sc.nextInt();
	 res=l*b;
	 System.out.println("area of rectangle="+res);
 }
}
