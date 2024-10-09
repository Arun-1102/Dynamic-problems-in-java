package Accenture;
import java.util.*;
import java.lang.*;
public class qualify_margin {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int r=scan.nextInt();
        System.out.print("Enter size for Array : ");
        int as=scan.nextInt();
        int[] a=new int[as];
        for(int i=0;i<as;i++)
        a[i]=scan.nextInt();

        int t=Arrays.stream(a).sum();

        t=Math.abs((r*n)-t);
        System.out.print(t<m?t:-1);
    }
}
