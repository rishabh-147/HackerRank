
package Thirty_days_of_Code_2022;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class day_29
{

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        String[][] arr = new String[n][2];

            for(int i = 0;  i < n; i++) {
                arr[i][0]= ob.next();
                arr[i][1]= ob.next();
                //System.out.println(i);
                        
        }
        
        ArrayList<String> set  = new ArrayList<>(6);
        for(int i = 0 ; i < n; i++) {
            //System.out.println("########");
        
         if(arr[i][1].substring(arr[i][1].indexOf('@')).equalsIgnoreCase("@gmail.com")) 
             set.add(arr[i][0]);
         
        }
        Collections.sort(set);
        for(String i : set) {
            System.out.println(i);
        }
    }
    
    

}
