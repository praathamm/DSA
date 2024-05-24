
import java.util.Scanner;

import javax.swing.RootPaneContainer;

//root:tos
// push(e) is insert_left
// pop(e) is delete left
// peek is return tos.data
// print is printlist with tos
// is full not possible
// is empty is inbuilt with push and pop


public class StackusingLinkedList {
    static Node tos;

    void create_list()
    {
        tos=null;//indicates list is not created till now
    }

void push(int e){
    Node n = new Node(e);
    if(tos == null){
        tos = n;
    }
    else{
        n.next = tos;
        tos=n;
    }
}

void pop()
        {
            if(tos==null)
                System.out.println("Stack empty");
            else
            {
            Node t=tos;//1
            tos=tos.next;//2
            System.out.println("Deleted:"+t.data);//3 only to show response
            }
        }

int peek(){
    return tos.data;
}

void printStack(){
    Node t = tos;
    while(t!=null){
        System.out.println("tos.data ");
    }
}

boolean isEmpty(){
    return tos==null;
}





public static void main(String[] args) {
        StackusingLinkedList stack=new StackusingLinkedList();
        System.out.println("Enter Size: ");
        Scanner sc=new Scanner (System.in);
        int size=sc.nextInt();
        stack.create_list();
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
