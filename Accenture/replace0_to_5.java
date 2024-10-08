package Accenture;

// "static void main" must be defined in a public class.
import java.util.*;
public class replace0_to_5{
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        String str=scan.next();
        str=str.replace("0","5");
        System.out.print(str);
    }
}