import java.util.Scanner;
public class d111{
    private static final String YES = "yes";
    private static final String NO = "no";

    public static String isLight_more_light(int n){
        double num = Math.sqrt(n);
        if(Math.floor(num) == Math.ceil(num))
            return YES;
        else
            return NO;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int value = sc.nextInt();
            if(value == 0)
                break;
            System.out.printf("%s\n",isLight_more_light(value));
        }

    }
}