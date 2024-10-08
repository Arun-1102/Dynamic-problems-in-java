package Accenture;

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int s=scan.nextInt();
        int k=scan.nextInt();
        int p=0;
       for(int i=1;i<k;i++){
           p=s-1;
           s=s+p;
       }
        System.out.print(s);
    }
}
