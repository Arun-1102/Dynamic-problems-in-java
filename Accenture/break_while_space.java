// "static void main" must be defined in a public class.
package Accenture;
import java.util.*;
public class break_while_space{
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        while(true){
            String s=scan.nextLine();
            System.out.println(s);
            if(s=="")
                break;
        }
    }
}