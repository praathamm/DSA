package Interviews;
import java.util.*;
public class PhoneDial {
    public static void main(String args[]) {

        /* This is how to declare HashMap */
        HashMap hmap = new HashMap();

        /*Adding elements to HashMap*/
        hmap.put(1, " ");
        hmap.put(2, "abc");
        hmap.put(3, "def");
        hmap.put(4, "ghi");
        hmap.put(5, "jkl");
        hmap.put(6, "mno");
        hmap.put(7, "pqrs");
        hmap.put(8, "tuv");
        hmap.put(9, "wxyz");
        hmap.put(0, "_");
        int no = 23;
        int tno=no;
        int rno=0;
        while(tno>0) {
            int digit = tno % 10;
            rno = rno * 10 + digit;
            tno = tno / 10;
        }
        ArrayList list=new ArrayList();
        while(rno>0)
        {
            int digit=rno%10;
            rno=rno/10;
            list.add((String) hmap.get(digit));
        }
        String w1=(String)list.get(0);
        String w2=(String)list.get(1);

        for (int i =0;i<w1.length();i++)
        {
            for(int j=0;j<w2.length();j++)
            {
               System.out.println(w1.charAt(i)+""+w2.charAt(j));
            }

        }

    }
}
