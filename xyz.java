import java.util.Scanner;
public class xyz
{ 

public static void main(String[] args)
  {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of sides: ");
int n = sc.nextInt();
System.out.print("Enter the side : ");
double side = sc.nextDouble();
System.out.println("The area of the polygon is "+area(n,side));
  }
public static double area(int n, double side)
 {
return(n*Math.pow(side, 2)/(4 * Math.tan(Math.PI /n)));
 }
}