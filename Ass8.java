package minal_java;
import java.util.Scanner; //palindrome number 
public class Ass8 {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pal();
	}
	public static void Pal()
	   {
		   int r,n,sum=0,temp;
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the number:");
		   n=sc.nextInt();
		   temp=n;
		   while(n>0)
		   {
			   r=n%10;
			   sum=(sum*10)+r;
			   n=n/10;
		   }
		   if(temp==sum)
		   {
			   System.out.println("The number is palindrome");
		   }
		   else
		   {
			   System.out.println("The number is not palindrome");
		   }
	   }
}
