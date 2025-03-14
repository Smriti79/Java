import java.util.Scanner;
public class array 
{

	public static void main(String[] args) 
	{
	
		int a[]=new int[3];
		Scanner sc=new Scanner(System.in);
		 for (int i=0;i<3;i++)
{
System.out.println("Enter a number: ");
     a[i]=sc.nextInt();	
}	
		for (int i=0;i<3;i++)
	    System.out.print(a[i]);
	
	}

}
