package minal_java;
import java.util.Scanner; // find the factorial
public class ass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Fac();
	}
    public static void Fac()
    {
    	int num,fac=1;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number:");
    	num=sc.nextInt();
    	for(int i=1;i<=num;i++)
    	{
    		fac*=i;
    	}
    	System.out.println("factorial is:"+fac);
    }
} 
