package testday5;

import java.util.*;

public class comapre {

    public static void main(String[] args) {
        System.out.print("Enter a string:");
        Scanner sc= new Scanner (System.in);
        String str= sc.next();

        HashMap<Character, Integer> hs = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int defval=1;
           char ch = str.charAt(i);
           if(hs.containsKey(ch)){
            int val=hs.get(ch);
            hs.put(ch, val+1);
           }else
           hs.put(ch, defval);
        }
        System.out.println(hs);
        Integer max=1;
        for(Character key:hs.keySet()){
            if(hs.get(key)>max){
                max=hs.get(key);
            }
        }
        System.out.println(max);

    }
}
