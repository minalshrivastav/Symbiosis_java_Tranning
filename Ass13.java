package minal_java;
import java.util.Scanner;
public class Ass13 { // ascii value

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ascii();
	}
   public static void ascii()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the character:");
	   char character=sc.next().charAt(0);
	   int asciival=(int) character;
	   System.out.println("ascii value of"+ character +" is="+ asciival);
	   
   }
}
