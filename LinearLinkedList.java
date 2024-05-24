import java.util.Scanner;

public class LinearLinkedList {
        static Node root;
        void create_list()
        {
            root=null;//indicates list is not created till now
        }
        void insert_left(int data)
        {
            Node n=new Node(data);
            if(root==null)//root is assigned not created
                root=n;
            else {
                n.next=root;//1
                root=n;//2
            }
        }
        void delete_left()
        {
            if(root==null)
                System.out.println("List empty");
            else
            {
            Node t=root;//1
            root=root.next;//2
            System.out.println("Deleted:"+t.data);//3 only to show response
            }
        }
        void insert_right(int data)
        {
            Node n=new Node(data);
            if(root==null)//root is assigned not created
                root=n;
            else {
                Node t=root;//1
                while(t.next!=null)//2
                {
                    t = t.next;//
                }
                t.next=n;//3
            }
        }
        void delete_right()
        {
            if(root==null)
                System.out.println("List empty");
            else
            {
                Node t,t2;
                t=t2=root;//1
                while(t.next!=null)//2
                {
                    t2=t;//left behind
                    t=t.next;//moves ahead
                }
                if(t==root)//only for single node
                    root=null;//manual deletion of root
                else
                    t2.next=null;//3
                System.out.println("Deleted:"+t.data);//3 only to show response
            }
        }


        void printList(){
            if (root==null) {
                System.out.println("List is empty");
                
            }
            Node t;
            t=root;
            while (t!=null) {   //use t instead of t.next while comparing because t.next wont print the last element 
                System.out.print(t.data+" ");
                t=t.next; 
                
            }
        }


        void search(int key){
            if(root==null)
            System.out.println("List is empty");
            else
            {   
                Node t=root;
                while (t!=null && t.data!=key) { 
                t=t.next;
                }
                if(t==null){
                    System.out.println("Not found in list");
                }
                else System.out.println("Key found!");
        }
    }

    void delete(int key) {
        if (root == null)//root is assigned not created
            System.out.println("Empty List");
        else
        {
            Node t = root;//1
            Node t2=root;//1
            while (t != null && t.data != key)//2
            {
                t2=t;
                t = t.next;
            }
            if(t==null)//not found
                System.out.println(key+" not found in list");
            else //found
            {
                System.out.println(key+" found in list");
                if(t==root)//case 1:
                    root=root.next;
                else if(t.next==null)//case 2
                    t2.next=null;
                else//case 3
                    t2.next=t.next;
                System.out.println("Deleted:"+t.data);
            }
        }
    }

    void insert_at(int data, int pos)
    {
        Node n=new Node(data);
        if(root==null)//root is assigned not created
            root=n;
        else {
            Node t = root;
            int count = 0;
            while (t!= null && count < pos - 1) {
                t = t.next;
                count++;
            }
            if (t == null) {
                System.out.println("Invalid position");
            } else {
                n.next = t.next;
                t.next = n;
            }
        }
    }

    void delete_at(int data, int pos) {
        Node t = root;
        Node t2 = root;
        int count = 0;
        while (t!= null && count < pos) {
            t2 = t;
            t = t.next;
            count++;
        }
        if (t == null) {
            System.out.println("nai mila");
        } else if (count == pos) {
            if (t == root) {
                root = root.next;
            } else {
                t2.next = t.next;
            }
            System.out.println("bc mil gaya");
        } else {
            System.out.println("Invalid input");
        }
    }

        public static void main(String[] args) {
            LinearLinkedList list=new LinearLinkedList();
            Scanner sc= new Scanner(System.in);
            list.create_list();
            int choice;
        do { 

            System.out.println("\n1.Insert Left  \n2.Delete Left \n3.Insert Right  \n4.Delete Right \n5.Print \n6.Search \n7.Delete \n8.Insert At \n9.Delete at \n0.Exit");
            System.out.println("Enter your choice: ");
            choice=sc.nextInt();
       
        switch (choice)
            {
                case 1 -> {
                    
                        System.out.println("Enter an element to Insert in Left:");
                        int element=sc.nextInt();
                        list.insert_left(element);
                    
                }
                case 2 -> {
                    if(root!=null){
                        System.out.println("Deleted Element:");
                        list.delete_left();
                    }
                    else
                        System.out.println("List is Empty..");
                }
                case 3 -> {
                    
                        System.out.println("Enter an element to Insert in Right:");
                        int element=sc.nextInt();
                        list.insert_right(element);
                    
                }
                case 4 -> {
                    if(root!=null){
                        System.out.println("Deleted Element:");
                        list.delete_right();
                    }
                    else
                        System.out.println("List is Empty..");
                }
                case 5 ->{
                    if(root!=null){
                        list.printList();
                    }
                    else
                        System.out.println("List is Empty..");
                }

                case 6 ->{
                    System.out.println("Enter Element to Search: ");
                    int e=sc.nextInt();
                    list.search(e);
                }

                case 7 ->{
                    System.out.println("Enter Element to Delete: ");
                    int e=sc.nextInt();
                    list.delete(e);
                }


                case 8 ->{
                    System.out.println("Enter Element to insert: ");
                    int e=sc.nextInt();
                    System.out.println("Enter position to insert: ");
                    int p=sc.nextInt();
                    list.insert_at(e, p);
                }


                case 9 ->{
                    System.out.println("Enter Element to delete: ");
                    int e=sc.nextInt();
                    System.out.println("Enter position to delete: ");
                    int p=sc.nextInt();
                    list.delete_at(e, p);
                }



                case 0 -> System.out.println("Thanks for using the code...");
                default -> System.out.println("Wrong option selected..");
            }

        }while(choice!=0);//condtion exit choice in inverted to option
    }
 }

