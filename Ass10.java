package minal_java;
import java.util.Scanner;
public class Ass10 { // calculate the grade of student of marks

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menudriven();
	}
   public static void menudriven()
   {
	   int ch,num1,num2,res;
	   Scanner sc=new Scanner(System.in);
	   do {
		   System.out.println("-----menu------");
		   System.out.println("1.Addition:");
		   System.out.println("2.Substraction:");
		   System.out.println("3.MUltiplication:");
		   System.out.println("4.Division:");
		   System.out.println("5.exit");
		   System.out.println("Enter the choice:");
		   ch=sc.nextInt();
		   switch(ch)
		   {
		   case 1:System.out.println("Enter the number 1:");
		          num1=sc.nextInt();
		          System.out.println("Enter the number 2:");
		          num2=sc.nextInt();
		          res=num1+num2;
		          System.out.println("result:"+res);
		          break;
		   case 2:System.out.println("Enter the number 1:");
		          num1=sc.nextInt();
		          System.out.println("Enter the number 2:");
		          num2=sc.nextInt();
		          res=num1-num2;
		          System.out.println("result:"+res);
		          break; 
		   case 3:System.out.println("Enter the number 1:");
		          num1=sc.nextInt();
		          System.out.println("Enter the number 2:");
		          num2=sc.nextInt();
		          System.out.println("result:"+num1*num2);
		          break;    
		   case 4:System.out.println("Enter the number 1:");
		          num1=sc.nextInt();
		          System.out.println("Enter the number 2:");
		          num2=sc.nextInt();
		          System.out.println("result:"+num1/num2);
		          break;      
		   default:System.out.println("invalid data:");
	              break;
		   }
	   }while(ch!=0);
   }
}
