import java.util.*;
public class d041{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int frequency = sc.nextInt();
        int caseCount = 1;
        sc.nextLine();
        while(frequency > 0){
            sc.nextLine();
            String [] date = {"day","month","year"};
            String [] dateToday = sc.nextLine().trim().split("/");
            String [] birthday = sc.nextLine().trim().split("/");
            Map<String,String> dtmap = new HashMap<String,String>();
            Map<String,String> hbmap = new HashMap<String,String>();
            for(int i=0; i<3; i++){
                dtmap.put(date[i], dateToday[i]);
                hbmap.put(date[i], birthday[i]);
            }
            System.out.print("Case #" + caseCount +": ");
            if(Integer.parseInt(dtmap.get("year")) < Integer.parseInt(hbmap.get("year")))
                System.out.println("Invalid birth date");
            else if(Integer.parseInt(dtmap.get("year")) > Integer.parseInt(hbmap.get("year"))){ 
                if(Integer.parseInt(dtmap.get("month")) < Integer.parseInt(hbmap.get("month"))) 
                    if(Integer.parseInt(dtmap.get("year")) - Integer.parseInt(hbmap.get("year")) -1 > 130)
                        System.out.println("Check birth date");
                    else
                        System.out.println(Integer.parseInt(dtmap.get("year")) - Integer.parseInt(hbmap.get("year")) -1);
                else if(Integer.parseInt(dtmap.get("month")) > Integer.parseInt(hbmap.get("month")))
                    if(Integer.parseInt(dtmap.get("year")) - Integer.parseInt(hbmap.get("year")) > 130)
                        System.out.println("Check birth date");
                    else
                        System.out.println(Integer.parseInt(dtmap.get("year")) - Integer.parseInt(hbmap.get("year")));
                else
                    if(Integer.parseInt(dtmap.get("day")) < Integer.parseInt(hbmap.get("day")))
                        if(Integer.parseInt(dtmap.get("year")) - Integer.parseInt(hbmap.get("year")) - 1 > 130)
                            System.out.println("Check birth date");
                        else
                            System.out.println(Integer.parseInt(dtmap.get("year")) - Integer.parseInt(hbmap.get("year")) - 1);
                    else
                        if(Integer.parseInt(dtmap.get("year")) - Integer.parseInt(hbmap.get("year")) > 130)
                            System.out.println("Check birth date");
                        else
                            System.out.println(Integer.parseInt(dtmap.get("year")) - Integer.parseInt(hbmap.get("year")));
                }else{
                    if(Integer.parseInt(dtmap.get("month")) < Integer.parseInt(hbmap.get("month")))
                        System.out.println("Invalid birth date");
                    else if(Integer.parseInt(dtmap.get("month")) > Integer.parseInt(hbmap.get("month")))
                        System.out.println("0");
                    else
                        if(Integer.parseInt(dtmap.get("day")) < Integer.parseInt(hbmap.get("day")))
                            System.out.println("Invalid birth date");
                        else
                            System.out.println("0");
                
                }
                ++caseCount;
                --frequency;
                dtmap.clear();
                hbmap.clear();
        }               
    }
}