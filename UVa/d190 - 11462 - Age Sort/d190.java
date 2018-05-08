import java.util.Arrays;
import java.util.Scanner;
public class d190{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int [] a = new int[n];
            if(n==0)
                break;
            for(int i=0; i<a.length; i++)
                a[i] = sc.nextInt();
            Arrays.sort(a);
            for(int value : a)
                System.out.printf("%d ",value);
            System.out.printf("\n");
        }
    }
}