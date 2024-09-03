package minal_java;

import java.util.Scanner;// square root

public class Ass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    root();
	}
  public static void root()
  {
	 int num1,root;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number:");
	 num1=sc.nextInt();
	 root=num1*num1;
	 System.out.println("Squate root is:"+root);
  }
}
