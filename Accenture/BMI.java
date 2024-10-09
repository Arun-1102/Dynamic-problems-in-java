package Accenture;
import java.util.*;
public class BMI {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int w=scan.nextInt();
        float h=scan.nextFloat();

        int b=w/(int)(h*2);
        if(b<18)
        System.out.println(0);
        if(b>=18 && b<=25)
        System.out.println(1);
        if(b>=25 && b<=30)
        System.out.println(2);
        if(b>=30 && b<=40)
        System.out.println(3);
        if(b>=40)
        System.out.println(4);
    }
    
}
