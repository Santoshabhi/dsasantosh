import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for(int i = 1; i <=n; i++) {
            a[i] = sc.nextInt();
        }
        int ft[] =  new int[n+1];
        for(int i=1;i<=n;i++){
            int j=i;
            while(j<=n){
                ft[j]=ft[j]+a[i];
                j=j+(j&-j);
            }
        }
        System.out.print(Arrays.toString(ft));
    }

	
}
