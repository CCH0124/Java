import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Solution2{
    private Scanner sc = new Scanner(System.in);
    /**
     * Three friends
     */
    private final int FRIEND = 3;
    /**
     * Save the question number.
     */
    private TreeSet<Integer> examList;
    /**
     * Record one to three friend list of question number.
     */
    private LinkedHashMap<Integer, TreeSet<Integer>> link;
    /**
     * Record the number of answers to each question.
     */
    private HashMap<Integer,Integer> frequency;

    private StringBuilder sb;
    
    public LinkedHashMap<Integer, TreeSet<Integer>> inputValue(){
        link = new LinkedHashMap<>();
        frequency = new HashMap<>();
        for(int i=1; i<=FRIEND; i++){
            int exam = sc.nextInt();
            examList = new TreeSet<>();
            for(int j=1; j<=exam; j++){
                int examItem = sc.nextInt();
                examList.add(examItem);
                if(frequency.containsKey(examItem)){
                    int n = frequency.get(examItem) + 1;
                    frequency.put(examItem, n);
                }else{
                    frequency.put(examItem, 1);
                }
            }
            link.put(i, examList);
        }
        return link;
    }

    public int getMost(LinkedHashMap<Integer, TreeSet<Integer>> link){
        this.link = link;
        List<Integer> oneRightAnswer = new ArrayList<>();
        int total = 0;
        for (Map.Entry<Integer, Integer> c : frequency.entrySet()) {
            if(c.getValue() == 1)
                oneRightAnswer.add(c.getKey());
        }
        for(Map.Entry<Integer, TreeSet<Integer>> entry : link.entrySet()){
            entry.getValue().retainAll(oneRightAnswer); // get Intersection
            total = Math.max(entry.getValue().size(), total);
        }
        return total;
    }

    public void display(int testCase, int temp, LinkedHashMap<Integer, TreeSet<Integer>> link) {
        this.link = link;
        Boolean bl = true;
        for (Map.Entry<Integer, TreeSet<Integer>> entry : link.entrySet()) {
            sb = new StringBuilder();
            if (entry.getValue().size() == temp) {
                if(bl){
                    sb.append("Case #" + testCase + ":\n");
                    bl = false;
                }
                sb.append(entry.getKey()).append(" ").append(temp).append(" ");
                for (Integer re : entry.getValue())
                    sb.append(re).append(" ");
                System.out.println(sb.toString().trim());
            }
        }
        examList.clear();
        link.clear();
        frequency.clear();
    }
    public LinkedHashMap<Integer, TreeSet<Integer>> getLink(){
        return link;
    }
    public Solution2(){
        while (sc.hasNextInt()) {
            int caseNum = sc.nextInt();
            for (int i = 1; i <= caseNum; i++) {
                display(i, getMost(inputValue()), getLink());
            }
        }
    }
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        
    }
}