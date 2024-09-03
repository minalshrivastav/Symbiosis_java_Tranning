package minal_java;
import java.util.Scanner; // average of number
public class Ass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       average();
	}
    public static void average()
    {
    	int sum=0,ave;
    			int len;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the size of array:");
    	int size=sc.nextInt();
    	int[] array=new int[size];
    	System.out.println("Enter the value:");
    	for(int i=0;i<=array.length;i++)
    	{
    		int value=sc.nextInt();
    	}
    	ave=sum/len;
    	System.out.println("average of number is"+ave);
    	
	   }
}
