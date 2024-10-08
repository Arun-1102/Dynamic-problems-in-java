package Accenture;

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int r1=scan.nextInt();
        int h1=scan.nextInt();
        int r2=scan.nextInt();
        int m=scan.nextInt();
        
        int th=m/60;
        int sum=0;
        for(int i=1;i<=th;i++){
            if(i<=h1)
                sum=sum+20;
            
            else
                sum=sum+40;
        }
        
       
        System.out.print(sum);
    }
}