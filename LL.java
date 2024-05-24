
public class LL {
    static Node root;

    void createList(){
        root=null;
    }

    void insertleft(int data){
        Node newnode=new Node(data);
        if(root==null){
            root=newnode;

        }
        else{
            newnode=root;
            root=newnode;
        }
    }

    void deleteleft(){
        Node temp=root;
        root=root.next;
    }

    void insertright(int data){
        Node newnode=new Node(data);
        Node t=root;
        if(root==null){
          root=newnode; 
        }else{
            while(t!=null){
        t=t.next;
        }
        t.next=newnode;
        }
    }


    void deleteright(){
        Node t=root;
        Node t2=root;
        while(t!=null){
            t2=t;
            t=t.next;
        }
        t2.next=null;
    }


    void print(){
        Node t=root;
        while(t!=null){
            System.out.println(t.data);
        }
    }

    void search(int data){
        Node t=root;
        while(t!=null){
            t=t.next;
            if(t.data==data){
                System.out.println("found");
            }
            else if(t==null){
                System.out.println("not found");
            }
        }


        while(t.data!=data && t==null){
            t=t.next;
            if(t.data==data){
                System.out.println("mila");
            }
            else if(t==null){
                System.out.println("not found");
            }
        }
        
    }


    

    void delete(int data){
        Node t=root;
        Node t2=root;
        while(t.data!=data && t!=null){
           t2=t;
            t=t.next;
        }
        if(t.data==data){
            t2.next=t.next;
            
        }
    }


    
}
