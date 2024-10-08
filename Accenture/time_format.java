package Accenture;
import java.util.*;
public class time_format {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int y=scan.nextInt();
        System.out.print(check(x,y));
    }
    public static int check(int x,int y){
        if(x*y<=12)
        return x*y;

        if((x*y)-12<=12)
        return (x*y)-12;
    
        return -1;
}
}
