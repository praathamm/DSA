package stack_examples;

import java.util.Scanner;

public class maxstack
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
    //main code for menu driven 1.push 2.pop 3.peek 4.print
    public static void main(String args[])
    {
        int size,element,choice;
        maxstack obj=new maxstack();
        maxstack max=new maxstack();
        System.out.println("Enter size of stack:");
        Scanner in=new Scanner(System.in);
        size=in.nextInt();
        obj.create_Stack(size);
        do
        {
            System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print Stack\n0.Exit\n:");
            choice=in.nextInt();
            switch (choice)
            {
                case 1:
                        if(obj.isFull()!=true)//!obj.isFull()
                        {
                            System.out.println("Enter an element:");
                            element=in.nextInt();
                            obj.push(element);
                        }
                        else
                            System.out.println("Stack is full..");
                        break;
                case 2:
                    if(obj.isEmpty()!=true)
                       System.out.println("Element Poped:"+obj.pop());
                    else
                        System.out.println("Stack is Empty..");
                    break;
                case 3:
                    if(obj.isEmpty()!=true)
                        System.out.println("Element @ Peek:"+obj.peek());
                    else
                        System.out.println("Stack is Empty..");
                    break;
                case 4:
                    if(obj.isEmpty()!=true) {
                        System.out.println("Element in stack are");
                        obj.print_Stack();
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