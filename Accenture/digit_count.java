package Accenture;
import java.util.*;
public class digit_count {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a=scan.nextLine();
        String b=scan.nextLine();
        String c=scan.nextLine();
         System.out.println(check(a,b,c));
 }
    static int check(String a,String b,String c){
        
        char[] A=a.toCharArray();
        char[] B=b.toCharArray();
        char[] C=c.toCharArray();
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    if(A[i]==B[j] && B[j]==C[k])
                      return Integer.parseInt(String.valueOf(A[i]));
                }
                
            }
           
        }
        return -1;
    }
}
//456
//375
//529