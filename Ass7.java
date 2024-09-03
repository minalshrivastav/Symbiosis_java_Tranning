package minal_java;
import java.util.Scanner;// find the remainder without using mod operator
public class Ass7 {
    
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		remender();
     
	}
	 public  static void remender()
	    {
	      int num1,num2,res;
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the number 1:");
	      num1=sc.nextInt();
	      System.out.println("Enter the number 2:");
	      num2=sc.nextInt();
	      res=num1-(num1/num2)*num2;
	      System.out.println("remainder is:"+res);
	    }
}
