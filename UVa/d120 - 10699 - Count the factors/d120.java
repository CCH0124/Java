import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class d120{
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            int temp = n;
            int num = 2;
            if( n == 0)
                break;
            while(num<=n && n!=1){
                if(n%num == 0){
                    set.add(num);
                    n = n / num;
                }else{
                    num++;
                }
            }
            System.out.printf("%d : %d\n",temp,set.size());
            set.clear();
        }
    }
}