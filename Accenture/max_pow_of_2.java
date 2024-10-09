package Accenture;
import java.util.*;
public class max_pow_of_2 {
   static int pow(int a,int b){
    int m=0,r=0;
        for(int i=a;i<=b;i++){
            int t=count(i);
            if(t>m){
                m=t;
                r=i;
            }
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.print(pow(a,b));
    }
    static int count(int k){
        int c=0;
        while(k!=0 && k%2==0){
            c++;
            k=k/2;
        }
        return c;
    }
}
