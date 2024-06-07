package Interviews;
import java.util.Arrays;
public class CharReverse {
    public static void main(String args[])
    {
        String s="JAVA";
        char[] a=s.toCharArray();
        for(int i =0,j=a.length-1;i<=j;i++,j--)
        {
            char temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }

       for(int i =0;i<a.length;i++)
            System.out.print(a[i]);
        Arrays.sort(a);
        System.out.println("in order:");
        for(int i =0;i<a.length;i++)
            System.out.print(a[i]);
    }
}