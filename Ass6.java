package minal_java;
import java.util.Scanner; // check whether the character is alphabet or digit
public class Ass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   character();
	}
    public static void character()
    {
    	char ch;
    	Scanner obj=new Scanner(System.in);
    	System.out.println("Enter the charater:");
    	ch=obj.next().charAt(0);
    	if((ch>='a' && ch>='z')||(ch>='A' && ch>='Z'))
    	{
    		System.out.println("This is an Alphabet");
    	}
    	else if((ch>='0' && ch>='9'))
    	{
    		System.out.println("This is an Digit");
    	}
    	else
    	{
    		System.out.println("This is an Special charater");
    	}
    	
    }
}
