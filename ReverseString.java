
import java.util.Scanner;

public class ReverseString{         //ADTs- push, pop, print, isfull and isempty
    int MaxSize, tos;
    char stack[];


    void createStack(int size){
    MaxSize= size;
    tos=-1;                         //pointer 
    stack=new char[MaxSize];
    }

    void push(char e){               //insert element at the top of the stack
        tos++;
        stack[tos]=e;
    }

    boolean isEmpty(){
        return tos==-1;
    }





    void printStack(){              //print data in LIFO from tos to 0
        for (int i = tos; i > -1; i--) {
            System.out.print(stack[i]);
        }
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        String string;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        string = sc.next();
        rs.createStack(string.length()); // Create a stack with size equal to the length of the input string
        for (int i = 0; i < string.length(); i++) {
            rs.push(string.charAt(i)); // Push each character onto the stack
        }
        rs.printStack(); // Print the stack contents
    }
    
}


