package Accenture;
import java.util.*;
public class elimination {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=1;i<=n;i++)
        l.add(i);

        int c=2;
        while(l.size()!=1){
            if(c%2==0){
                for(int i=0;i<l.size();i+=2)
                l.remove(i);
                c++;
            }
            else{
                for(int k=l.size()-1;k>=0;k-=2)
                l.remove(k);
                c++;
            }
        }
        System.out.print(l);
    }

}
