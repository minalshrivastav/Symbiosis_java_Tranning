package minal_java;

public class Ass9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Rev();
	}
   public static void Rev()
   {
	   int[] arr=new int[] {1,2,3,4,5};
	   System.out.println();
	   int n=arr.length;
	   System.out.println("reverse of an array:");
	   for(int i=n-1;i>=0;i--)
	   {
		   System.out.println(arr[i]+"");
	   }
   }
}
