import java.util.*;
public class minNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("enter the amount: ");
int amt=sc.nextInt();
System.out.println("number of rs2000 note"+(amt/2000));
System.out.println("number of rs500 note"+(amt%2000)/500);
System.out.println("number of rs200 note"+((amt%2000)%500)/200);
System.out.println("number of rs100 note"+(((amt%2000)%500)%200)/100);
System.out.println("number of rs50 note"+((((amt%2000)%500)%200)%100)/50);
System.out.println("number of rs20 note"+(((((amt%2000)%500)%200)%100)%50)/20);
System.out.println("number of rs10 note"+((((((amt%2000)%500)%200)%100)%50)%20)/10);
System.out.println("number of rs5 note"+(((((((amt%2000)%500)%200)%100)%50)%20)%10)/5);
System.out.println("number of rs2 note"+((((((((amt%2000)%500)%200)%100)%50)%20)%10)%5)/2);
System.out.println("number of rs1 note"+(((((((((amt%2000)%500)%200)%100)%50)%20)%10)%5)%2)/1);	
	}

}
