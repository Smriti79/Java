package A1.Q10;
import java.util.*;
public class q10 {
   
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n");
    int x=sc.nextInt();
    //check prime
    for(int i=2;i<x;i++){
        if(x%i==0){
            System.out.println("this is not a prime number" );
        }else{
             System.out.println("this is a prime number" );
        }
    }
   } 
}
