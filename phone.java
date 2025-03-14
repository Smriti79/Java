package dsaAssignmentTwo;
import java.util.Scanner;
	public class phone
	{
	int area_code;
	int exchange;
	int number;
	public void input()
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter area code: ");
	area_code = sc.nextInt();
	System.out.print("Enter exchange: ");
	exchange = sc.nextInt();
	System.out.print("Enter number: ");
	number = sc.nextInt();
	}
	public void display() 
	{
	System.out.println("(" + area_code + ") " + exchange + "-" + number);
	}
	public static void main(String[] args) 
	{
	phone phone1 = new phone();
	phone1.area_code = 172;
	phone1.exchange = 211;
	phone1.number = 9800;
	phone phone2 = new phone();
	phone2.input();
	System.out.print("My Number is ");
	phone1.display();
	System.out.print("Your Number is ");
	phone2.display();
	}



}
