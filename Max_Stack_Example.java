package Interviews;
import java.util.*;
class Stack_Basic
{
    int MaxSize,tos,stack[];
    //create_Stack:creates stack,init tos -1 and prepare stack for use
    void create_Stack(int size)
    {
        MaxSize=size;
        tos=-1;
        stack=new int[MaxSize];
    }
    //push(e):will insert element on top of stack
    //            tos+1
    void push(int e)
    {
        tos++;//1
        stack[tos]=e;//pushed---stack[++tos]=e
    }
    //isFull():returns true if full else false
    boolean isFull()
    {
        if(tos==MaxSize-1)//as array
            return true;
        else
            return false;
    }
    //pop():e remove and return element from tos,tos-1
    int pop()
    {
        int temp=stack[tos];//1
        tos--;//2
        return(temp);//3
    }
    //peek():e only returns element from tos/on the top
    int peek()
    {
        return(stack[tos]);
    }
    //isEmpty():returns true if empty else false
    boolean isEmpty()
    {
        if(tos==-1)//as array
            return true;
        else
            return false;
    }
    //print_stack():prints data in LIFO manner,tos to 0
    void print_Stack()
    {
        for(int i=tos;i>-1;i--)
        {
            System.out.println(stack[i]);
        }
    }
}
public class Max_Stack_Example
{
    public static void main(String args[])
    {
        Stack_Basic normal=new Stack_Basic();
        Stack_Basic max_stack=new Stack_Basic();
        normal.create_Stack(10);
        max_stack.create_Stack(10);
        int choice,element;
        Scanner in=new Scanner(System.in);
        do
        {
            System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print Stack\n0.Exit\n:");
            choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    if(normal.isFull()!=true)//!obj.isFull()
                    {
                        System.out.println("Enter an element:");
                        element = in.nextInt();
                        normal.push(element);
                        if (max_stack.isEmpty())
                            max_stack.push(element);
                        else //not empty then push iff e is greater
                        {
                            if (element > max_stack.peek()) {
                                max_stack.push(element);
                                System.out.println("Enter to Max_stack also:"+element);

                            }

                        }
                    }
                    else
                        System.out.println("Stack is full..");
                    break;
                case 2:
                    if(normal.isEmpty()!=true) {
                        int top = normal.pop();
                        System.out.println("Element Poped:" + top);
                        //if removed element is peek of max_stack them remove
                        if (top == max_stack.peek())
                            System.out.println("From Max Stack Element Poped:" + max_stack.pop());
                    }
                    else
                        System.out.println("Stack is Empty..");
                    break;
                case 3:
                    if(normal.isEmpty()!=true)
                        System.out.println("Element @ Peek:"+normal.peek());
                    else
                        System.out.println("Stack is Empty..");
                    break;
                case 4:
                    if(normal.isEmpty()!=true) {
                        System.out.println("Element in stack are");
                        normal.print_Stack();
                    }
                    else
                        System.out.println("Stack is Empty..");
                    break;
                case 0:
                    System.out.println("Thanks for using the code...");
                    break;
                default:
                    System.out.println("Wrong option selected..");
                    break;
            }

        }while(choice!=0);//condtion exit choice in inverted to option
    }

}

