import java.util.*;
public class sevenWonders {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String wd[]=new String[7];
		String lc[]=new String[7];
	
		
		for(int i=0;i<7;i++)
	
	{
			System.out.println("enter seven wonders");
		wd[i]=sc.next();
	}
		
	for(int i=0;i<7;i++)
	{
		System.out.println("enter locations of seven wonders");
		lc[i]=sc.next();
	}
	System.out.println("enetr a country name u want to search: ");
	String cty=sc.next();
	int f=0;
	for (int i=0;i<7;i++)
	{
		if(cty.equals(lc[i]))
		{
			f=1;
			break;
		}
		
		if(f==1)
		{
			System.out.println("search succesfull");
			System.out.print(lc[i]+":\twonders:\t"+wd[i]);
		}
		else 
			System.out.println("search unsuccesfull");
	}
	}

}
