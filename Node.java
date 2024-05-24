//nodes in linked list have a "has a" relationship
//LL is collection of nodes aligned in a liner manner
//it is liner and dynamic
//when root of linked llilst dies, all nodes get aut oagarbage collectied becuase only root is saved
//tonext- points to the next node's address
//leftmost node as always root, rightmost means points to null i.e no address
//root is not created, it is assigned
public class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    
}
