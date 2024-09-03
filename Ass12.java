package minal_java;
import java.util.Scanner;
public class Ass12 {  //minimum and maximum of array
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     maxandmin();
	}
	public static void maxandmin()
	{
		int []array= {3,6,78,9,12,56};
		int min =array[0];
		int max=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
			}
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		System.out.println("minimum value is:"+min);
		System.out.println("maximum value is:"+max);
}
}
