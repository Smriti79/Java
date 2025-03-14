import java.util.Scanner;
public class palindromeString {

	public static void main(String[] args) 
	{

Scanner sc = new Scanner(System.in);
System.out.print("Enter a String : ");
String s = sc.nextLine();
System.out.println(s + (isPalindrome(s) ? " is " : " is not ") +"a palindrome.");
    }
public static boolean isPalindrome(String s) 
{
return s.equals(reverse(s)) ? true : false;
}
public static String reverse(String s)
{
String reverse = ""; 
for (int i = s.length() - 1; i >= 0; i--) 
{
reverse=reverse+s.charAt(i);
}
return reverse; 
}
}
