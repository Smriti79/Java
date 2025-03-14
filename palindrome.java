import java.util.Scanner;
public class palindrome 
{

	public static void main(String[] args)
	{
Scanner sc = new Scanner(System.in);
System.out.print("Enter an integer: ");
int number = sc.nextInt();
System.out.println(number+" " + (isPalindrome(number)? "is" : "is not") + " a palindrome.");
    }
	public static int rev (int number)
{
	int rev=0;
	while(number>0)
	{
		int r=number%10;
		rev=rev*10+r;
		number=number/10;
	}
	return rev;
}
public static boolean isPalindrome(int number)
{
if(number==rev(number))
return true;
else
return false;
}
}