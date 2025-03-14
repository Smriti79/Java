import java.util.Scanner;
public class question 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int sum=0;
while(n>0)
{
	int d=n%10;
	n=n/10;
	sum=sum+d;
}
if(sum%9==0)
{
	System.out.println("The number is divisible by 9");
}
else
{
	System.out.println("The number is not divisible by 9");
}
	}

}
