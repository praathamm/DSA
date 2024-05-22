
import java.util.Scanner;

public class DoubleStack{         //ADTs- push, pop, print, isfull and isempty
    int MaxSize, tos1,tos2, stack[];


    void createStack(int size){
    MaxSize= size;
    tos1=-1; 
    tos2=MaxSize;                        //pointers outside stacks 
    stack=new int[MaxSize];
    }

    void push1(int e){               //insert element at the top of the stack
        tos1++;
        stack[tos1]=e;
    }

    void push2(int e){               //insert element at the top of the stack
        tos2--;
        stack[tos2]=e;
    }

    boolean isFull1(){                 
        if (tos1==MaxSize-1 || tos1+1==tos2) 
            return true;
         else 
            return false;
    }


    boolean isFull2(){                 
        if (tos2==0 || tos2+1==tos1) 
            return true;
         else 
            return false;
    }


    int pop1(){                       //remove element and return at the top of stack
        int temp=stack[tos1];
        tos1--;
        return(temp);
    }


    int pop2(){                       //remove element and return at the top of stack
        int temp=stack[tos2];
        tos2++;
        return(temp);
    }

    boolean isEmpty1(){
        return tos1==-1;
    }

    boolean isEmpty2(){
        return tos2==-MaxSize;
    }

    int peek1(){                     //only return element from tos without changing the structure 
        return stack[tos1];
    }

    int peek2(){                     //only return element from tos without changing the structure 
        return stack[tos2];
    }


    void printStack1(){              //print data in LIFO from tos to 0
        for (int i = tos1; i > -1; i--) {
            System.out.println(stack[i]);
        }
    }


    void printStack2(){              //print data in LIFO from tos to 0
        for (int i = tos2; i < MaxSize; i++) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        DoubleStack stack=new DoubleStack();
        System.out.println("Enter Size: ");
        Scanner sc=new Scanner (System.in);
        int size=sc.nextInt();
        stack.createStack(size);
        int choice;
        do { 

            System.out.println("\n1.Push1 \n2.Pop1 \n3.Peek1 \n4.Print1 \n5.Push2 \n6.Pop2 \n7.Peek2 \n8.Print2 \n9.Print All \n0.Exit");
            choice=sc.nextInt();

       
        switch (choice)
            {
                case 1 -> {
                    if(stack.isFull1()!=true)//!obj.isFull()
                    {
                        System.out.println("Enter an element:");
                        int element=sc.nextInt();
                        stack.push1(element);
                    }
                    else
                        System.out.println("Stack is full..");
                }
                case 2 -> {
                    if(stack.isEmpty1()!=true)
                        System.out.println("Element Poped:"+stack.pop1());
                    else
                        System.out.println("Stack is Empty..");
                }
                case 3 -> {
                    if(stack.isEmpty1()!=true)
                        System.out.println("Element @ Peek:"+stack.peek1());
                    else
                        System.out.println("Stack is Empty..");
                }
                case 4 -> {
                    if(stack.isEmpty1()!=true) {
                        System.out.println("Element in stack are");
                        stack.printStack1();
                    }
                    else
                        System.out.println("Stack is Empty..");
                }

                case 5 -> {
                    if(stack.isFull2()!=true)//!obj.isFull()
                    {
                        System.out.println("Enter an element:");
                        int element=sc.nextInt();
                        stack.push2(element);
                    }
                    else
                        System.out.println("Stack is full..");
                }
                case 6 -> {
                    if(stack.isEmpty2()!=true)
                        System.out.println("Element Poped:"+stack.pop2());
                    else
                        System.out.println("Stack is Empty..");
                }
                case 7 -> {
                    if(stack.isEmpty2()!=true)
                        System.out.println("Element @ Peek:"+stack.peek2());
                    else
                        System.out.println("Stack is Empty..");
                }
                case 8 -> {
                    if(stack.isEmpty2()!=true) {
                        System.out.println("Element in stack are");
                        stack.printStack2();
                    }
                    else
                        System.out.println("Stack is Empty..");
                }

                case 9 -> {
                    stack.printStack1();
                    stack.printStack2();
                }
                
                case 0 -> System.out.println("Thanks for using the code...");
                default -> System.out.println("Wrong option selected..");
            }


            

        }while(choice!=0);//condtion exit choice in inverted to option
    }

}


