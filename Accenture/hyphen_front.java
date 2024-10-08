package Accenture;
import java.util.*;
public class hyphen_front {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String f="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='-')
            f=s.charAt(i)+f;
            else
            f=f+s.charAt(i);
        }
        System.out.print(f);
    }
}
