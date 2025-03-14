package dsaAssignmentTwo;
import java.util.*;
public class complex 
	{
		double real;
		double imag;
		public void setData(double r, double i)
		{
		real = r;
		imag = i;
		}
		public void display() 
		{
		System.out.println(real + " + " + imag + "i");
		} 
		public complex add(complex c1, complex c2)
		{
		complex result = new complex();
		result.real = c1.real + c2.real;
		result.imag = c1.imag + c2.imag;
		return result;
		}
		public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the First Real Number : ");
		int r1=sc.nextInt();
		System.out.print("Enter the First Imaginary Number : ");
		int i1=sc.nextInt();
		complex c1 = new complex();
		c1.setData(r1,i1);
		complex c2 = new complex();
		System.out.print("Enter the Second Real Number : ");
		int r2=sc.nextInt();
		System.out.print("Enter the Second Imaginary Number : ");
		int i2=sc.nextInt();
		c2.setData(r2, i2);
		System.out.print("The First Complex Number : ");
		c1.display(); 
		System.out.print("The Second Complex Number : ");
		c2.display(); 
		complex sum = new complex();
		sum = sum.add(c1, c2);
		System.out.print("The Sum of Complex Numbers are ");
		sum.display(); 

	}

}
