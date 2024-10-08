package Accenture;
import java.util.*;
public class notation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int d=scan.nextInt();
        int n=scan.nextInt();
        int[] a=new int[36];
        
        int r;
        while(n!=0){
            r=n%d;
            if(r>=0 && r<=9)
            System.out.println(r);
            else
            System.out.println((char)(r+55));
            n=n/d;
        }
    }
}
