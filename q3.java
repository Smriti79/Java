package A1.Q3;

import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter m");
        int m=sc.nextInt();
        System.out.println("enter n");
        int n=sc.nextInt();
        int min=Math.min(m, n);
        int max=Math.max(m, n);
        if(m!=n){
              System.out.println("Forward");
            for(int i=min;i<=max;i++){
              
                System.out.print(i+" ");
            }
            System.out.println();
             System.err.println("Reverse");
            for(int i=max;i>min;i--){
               
                System.out.print(i+" ");
            }
        }
        else{
            System.out.println("This is same number");
        }
    }
}
