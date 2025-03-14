package A1.Q9;
import java.util.*;
public class q9 {
    static void gcd(int x,int y){
        int p=Math.min(x, y);
        for(int i=p;i>0;i--){
            if(x%i==0 && y%i==0){
                System.err.println("gcd= "+i);
            }else{
                System.out.println("gcd= "+1);
            }
        }
    }
    static void lcm(int x,int y){
        int lcm=1;
        int p=Math.min(x, y);
        while(p!=0){
            if(x%p==0 && y%p==0){
                lcm*=p;
            }
        }
        System.out.println("LCM is "+lcm);
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter two number");
    int x=sc.nextInt();
    int y=sc.nextInt();
    gcd(x,y);
    lcm(x,y);

    }
}
