import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class d097{
    private static final String JOLLY = "Jolly";
    private static final String NOT_JOLLY = "Not jolly";
    
    public static String isJolly(int num[]){
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<num.length-1; i++){ // num.length-1 because num[i+1]
            int result = Math.abs(num[i] - num[i+1]);
            //condition 1 to n-1
            if(result == 0) // can not zero
                return NOT_JOLLY;
            if(result > num.length-1) // can not > num.length-1
                return NOT_JOLLY;
            if(list.contains(result)) // can not repeat
                return NOT_JOLLY;
            list.add(result);
        }
        return JOLLY;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt(); // input how many number
            int [] num = new int[n]; // create Array. Length == n
            for(int i=0; i<num.length; i++)
                num[i] = sc.nextInt(); // Enter the value for the array element
            System.out.printf("%s\n",isJolly(num));
        }
    }
}