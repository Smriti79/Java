package A1.Q6;
import java.util.*;
public class q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
