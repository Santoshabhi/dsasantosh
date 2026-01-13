import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            
        }
        d=d%n;
        int t[]=new int[d];
        for(int i=0;i<d;i++){
            t[i]=a[i];
        }
        for(int i=d;i<n;i++){
            a[i-d]=a[i];
        }
        int j=0;
        for(int i=n-d;i<n;i++){
            a[i]=t[j];
            j++;
        }

       for(int x:a){
           System.out.print(x+" ");
       }
    }
}
