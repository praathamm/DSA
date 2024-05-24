public class DoublyLinkedList {
    Dnode root;

    void create_list()
    {
        root=null;//indicates list is not created till now
    }
    void insert_left(int data)
    {
        Dnode n=new Dnode(data);
        if(root==null)//root is assigned not created
            root=n;
        else {
            n.right=root;
            root.left=n;
            root=n;
        }
    }
    void delete_left()
    {
        if(root==null)
            System.out.println("List empty");
        else
        {
        Dnode t=root;//1
        root=root.right;//2
        t.left=null;
        System.out.println("Deleted:"+t.data);//3 only to show response
        }
    }
    void insert_right(int data)
    {
        Dnode n=new Dnode(data);
        if(root==null)//root is assigned not created
            root=n;
        else {
            Dnode t=root;//1
            while(t.right!=null)//2
            {
                t = t.right;//
            }
            t.right=n;//3
            n.left=t;
        }
    }
    void delete_right()
    {
        if(root==null)
            System.out.println("List empty");
        else
        {
            Dnode t,t2;
            t=root;
            while(t.right!=null)//2
            {
                t=t.right;//moves ahead
            }
            if(t==root)//only for single Dnode
                root=null;//manual deletion of root
            else{
            t2=t.left;
            t.right=null;
            
            System.out.println("Deleted:"+t.data);//3 only to show response
            }
        }
    }

    void printList(){
        if (root==null) {
            System.out.println("List is empty");
            
        }
        Dnode t;
        t=root;
        while (t!=null) {   //use t instead of t.next while comparing because t.next wont print the last element 
            System.out.print(t.data+" ");
            t=t.right; 
            
        }
    }


    void reversePrint(){
        if (root==null) {
            System.out.println("List is empty");
            
        }
        Dnode t;
        t=root;
        while(t!=null){
            t=t.right;
        
        while (t!=root) {   //use t instead of t.next while comparing because t.next wont print the last element 
            System.out.print(t.data+" ");
            t=t.left; 
            
        }
    }
    }

    














}
