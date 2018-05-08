import java.util.Scanner;
public class c203{
    private final String PERFECT = "perfect";
    private final String DEFICIENT = "deficient";
    private final String ABUNDANT = "abundant";

    public int sum(int n){
        int sum = 0;
        for(int i=1; i<n; i++){
            if(n%i == 0){
                sum += i;
            }
        }
        return sum;
    }
    private String compare(int sum,int n){
        if (sum > n) {
			return ABUNDANT;
		} else if (sum < n) {
			return DEFICIENT;
		} else {
			return PERFECT;
		}
    }
    public static void main(String[] args) {
        c203 c = new c203();
        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt();
        for(int i=1; i<=caseNum; i++){
            int num = sc.nextInt();
            int sumNum = c.sum(num);
            System.out.println(c.compare(sumNum,num));
        }
    }
}