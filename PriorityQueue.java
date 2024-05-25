//in order to implement priority queue we would modify enqueue by sorting it 

import java.util.Scanner;

public class PriorityQueue {
    int MaxSize, front, rear, queue[];

    void createQueue(int size){
        MaxSize = size;
        front = 0;
        rear = -1;
        queue=new int [MaxSize];
    }

    void Enqueue(int e){   //push
        rear++;
        queue[rear] = e;
    }

    boolean isFull(){
        return rear == MaxSize - 1;
    }


    int Dequeue(){        //pop
        int e = queue[front];
        front++;
        return e;
    }
    

    boolean isEmpty(){
        return front > rear;
    }

    void printQueue(){
        for(int i=front; i<=rear; i++){
            System.out.print(queue[i]+ " ");
         }
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PriorityQueue queue = new PriorityQueue();
    System.out.println("Enter Size: ");
    int size = sc.nextInt();
    queue.createQueue(size);

    int choice;
    do { 

        System.out.println("\n1.Enqueue \n2.Dequeue \n4.Print \n0.Exit");
        choice=sc.nextInt();

   
    switch (choice)
        {
            case 1 -> {
                if(queue.isFull()!=true)//!obj.isFull()
                {
                    System.out.println("Enter an element:");
                    int element=sc.nextInt();
                    queue.Enqueue(element);
                }
                else
                    System.out.println("Queue is full..");
            }
            case 2 -> {
                if(queue.isEmpty()!=true)
                    System.out.println("Element Poped:"+queue.Dequeue());
                else
                    System.out.println("Queue is Empty..");
            }
            case 3 -> {
                if(queue.isEmpty()!=true){
                    System.out.println("Element @ Peek:");
                    queue.printQueue();
                }
                else
                    System.out.println("queue is Empty..");
            }
            case 4 -> {
                if(queue.isEmpty()!=true) {
                    System.out.println("Element in queue are");
                    queue.printQueue();
                }
                else
                    System.out.println("queue is Empty..");
            }
            case 0 -> System.out.println("Thanks for using the code...");
            default -> System.out.println("Wrong option selected..");
        }

    }while(choice!=0);//condtion exit choice in inverted to option
}

}