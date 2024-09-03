package minal_java;
import java.util.Scanner;
public class Ass14 { // calculate the average of number in given array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       average();
	}
  public static void  average()
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter how many elements you want:");
	  int n=sc.nextInt();
	  int[] arr=new int[n];
	  System.out.println("enter array element:");
	  int sum=0;
	  for(int i=0;i<n;i++)
	  {
		  arr[i]=sc.nextInt();
		  sum+=arr[i];
	  }
	  System.out.println("Average is:"+sum/n);
  }
}
