package A1.Q7;
import java.util.*;
public class q7 {
    static int fib(int n){
        int abc=0;
        if(n==0&& n==1){
            return 1;
        }else{
            abc=n+fib(n-1);
        }
        return abc;
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    int n=sc.nextInt();
    for(int i=1;i<n+1;i++){
        System.out.print(fib(i)+" ");
    }
   } 
}
