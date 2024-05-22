
import java.util.Scanner;

public class BinarywithStack{         //ADTs- push, pop, print, isfull and isempty
    int MaxSize, tos;
    int stack[];

    void push(int e){               //insert element at the top of the stack
        tos++;
        stack[tos]=e;
    }

    void printStack(){              //print data in LIFO from tos to 0
        for (int i = tos; i > -1; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        int size=64;
        BinarywithStack obj=new BinarywithStack();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num=sc.nextInt();
        while(num>0){
            int j=num%2;
            obj.push(j);
            num=num/2;
        }
        System.out.print("Binary will be: ");
        obj.printStack();
    }

}
