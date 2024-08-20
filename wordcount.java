package testday5;
import java.util.*;
public class wordcount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        int words=1;
        int sentences=0;
        char[] arr= str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]=='.'){
                sentences++;
            }
            if(arr[i]==' '){
                words++;
            }
        }
        System.out.println(words+" words,"+ sentences+" sentences");
    }
}
