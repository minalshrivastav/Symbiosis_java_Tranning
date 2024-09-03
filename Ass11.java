package minal_java;
import java.util.Scanner;
public class Ass11 {  // calculate the grade of the student based on marks

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     garde();
	}
    public static void garde()
    {
    	int marks;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("ENter the marks:");
    	marks=sc.nextInt();
    	if((marks<35))
    	{
    		System.out.println("fail");
    	}
    	else if((marks<35) || (marks<44))
    	{
    		System.out.println("C");
    	}
    	else if((marks<45) || (marks<59))
    	{
    		System.out.println("B");
    	}
    	else if((marks<60) ||(marks<74))
    	{
    		System.out.println("A");
    	}
    	else if((marks<75) || (marks<89))
    	{
    		System.out.println("A+");
    	}
    	else
    	{
    		System.out.println("O");
    	}
    }
}
