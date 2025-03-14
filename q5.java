package A1.Q5;
import java.util.*;
public class q5 {
  public static void main(String[] args) {
    System.out.println("Enter n: ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    System.out.println("by loop");
    for(int i=1;i<=n;i++){
        sum+=i;
    }
    System.out.println( n*n+1 /2);
    System.out.println("by looping "+sum);
  }  
}
