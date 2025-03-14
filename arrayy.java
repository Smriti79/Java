import java.util.*;
public class arrayy {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size,sum=0;
	System.out.println("ENTER SIZE OF ARRAY: ");
	size=sc.nextInt();
	int a[]=new int[size];
	for (int i=0;i<size;i++)
		
	{
		System.out.print("Enter number: ");
		a[i]=sc.nextInt();
	}
	for(int i=0;i<size;i++)
		sum=sum+a[i];
	System.out.println("sum="+sum);
   
	}

}
