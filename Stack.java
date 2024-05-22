
import java.util.Scanner;

public class Stack{         //ADTs- push, pop, print, isfull and isempty
    int MaxSize, tos, stack[];


    void createStack(int size){
    MaxSize= size;
    tos=-1;                         //pointer 
    stack=new int[MaxSize];
    }

    void push(int e){               //insert element at the top of the stack
        tos++;
        stack[tos]=e;
    }

    boolean isFull(){                 
        if (tos==MaxSize-1) 
            return true;
         else 
            return false;
    }


    int pop(){                       //remove element and return at the top of stack
        int temp=stack[tos];
        tos--;
        return(temp);
    }


    boolean isEmpty(){
        return tos==-1;
    }


    int peek(){                     //only return element from tos without changing the structure 
        return stack[tos];
    }


    void printStack(){              //print data in LIFO from tos to 0
        for (int i = tos; i > -1; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        Stack stack=new Stack();
        System.out.println("Enter Size: ");
        Scanner sc=new Scanner (System.in);
        int size=sc.nextInt();
        stack.createStack(size);
        int choice;
        do { 

            System.out.println("\n1.Push \n2.Pop \n3.Print \n4.Peek \n0.Exit");
            choice=sc.nextInt();

       
        switch (choice)
            {
                case 1 -> {
                    if(stack.isFull()!=true)//!obj.isFull()
                    {
                        System.out.println("Enter an element:");
                        int element=sc.nextInt();
                        stack.push(element);
                    }
                    else
                        System.out.println("Stack is full..");
                }
                case 2 -> {
                    if(stack.isEmpty()!=true)
                        System.out.println("Element Poped:"+stack.pop());
                    else
                        System.out.println("Stack is Empty..");
                }
                case 3 -> {
                    if(stack.isEmpty()!=true)
                        System.out.println("Element @ Peek:"+stack.peek());
                    else
                        System.out.println("Stack is Empty..");
                }
                case 4 -> {
                    if(stack.isEmpty()!=true) {
                        System.out.println("Element in stack are");
                        stack.printStack();
                    }
                    else
                        System.out.println("Stack is Empty..");
                }
                case 0 -> System.out.println("Thanks for using the code...");
                default -> System.out.println("Wrong option selected..");
            }

        }while(choice!=0);//condtion exit choice in inverted to option
    }

}


