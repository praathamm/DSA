import java.util.Scanner;

public class BinaryTree {           //search, count and depth are the most important 

    Dnode root;
    
    private Dnode right;
    private Dnode left;
    

    
    
    void createTree() {
        root = null;
    }

    void insert(Dnode r, Dnode n) {  //dnode object for r=root and n=new node to insert 
        if (root == null)         //no root so make new root
            root = n;
        else {
            if (n.data < r.data) {      //root hai, root bigger than new so left insertion
                if (r.left == null) 
                    r.left = n;
                 else 
                    insert(r.left, n);  //you pass root, but as you go down, recusion passes a new "root"
                                        //copy of root in 'r' which will go below the root area
            } 
            else {
                if (r.right == null)        
                    r.right = n;
                else 
                    insert(r.right, n);
                    }
        }

    }


    void preorder(Dnode r){     //PLR
        if(root!=null){
        System.err.print(r.data+",");  
        preorder(r.left);
        preorder(r.right);
    }
    }

    void inorder(Dnode r){      //LPR
        if(r!=null){
        inorder(r.left);        //L
        System.err.print(r.data+",");  //P
        inorder(r.right);       //R
    }
    }


    void postorder(Dnode r){     //LRP
        if(root!=null){
        postorder(r.right);
        postorder(r.left);
        System.err.print(r.data+",");  
    }
    }


    boolean search(Dnode r, int key){
        boolean left, right;
        if(r==null){
            return false;
        }
        if(r.data==key){
            return true;
        }
        left=search(r.left,key);    
        right=search(r.right,key);
        return left||right;
    }



    // void count(Dnode r){
    //     boolean left, right;
    //     int count=0;
    //     if(r==null){
    //     System.out.println("Not found");        }
    //     if(r.data==root.data){
    //         count++;
    //         return;
    //     }
    //     while(!(left=search(r.left,r.data))){
    //         count++;
    //         return;
    //     }; 
        
    //     while(!(right=search(r.right,r.data))){
    //         count++;
    //         return;
    //     }; 
    //     System.out.println("Count was "+count);
        
    // }


    int count(Dnode r)
    {
        int left,right;
        if(r==null)
            return 0;
        else
        {
                left = count(r.left);
                right = count(r.right);
                return left+right+1;
        }

    }


    int depth(Dnode r)
    {
        int left,right;
        if(r==null)
            return 0;
        else
        {
                left = count(r.left);
                right = count(r.right);
                return Math.max(left, right)+1;
        }

    }


    boolean balance(Dnode r)
    {
        int left,right,balance;
        if(r==null)
            return false;
        else
        {
                left = depth(r.left);
                right = depth(r.right);
                balance=left-right;
                System.out.println(balance);
        }
        if(balance==1 || balance==(-1) || balance ==0){
            return true;
        }
        else
        return false;

    }

    int balanceGiver(Dnode r)
    {
        int left,right,balance;
        if(r==null){
        System.out.println("Tree hi nahi hai");
        return 0;
        }
        else
        {
                left = depthGiver(r.left);
                right = depthGiver(r.right);
                balance=left-right;
                return balance;
        }
    }


    int depthGiver(Dnode r)
    {
        int left,right;
        if(r==null)
            return 0;
        else
        {
                left = count(r.left);
                right = count(r.right);
                return Math.max(left, right)+1;
        }

    }


    void balanceNode(Dnode r, int key)
    {
        int left,right,balance;
        if(r==null){
            System.out.println("No tree");
        }
        if(r.data==key){
            System.out.println(key+" ka Balance factor is "+balanceGiver(r));
        }
        else if(search(r.left,key)){
            System.out.println(key+" ka Balance factor is "+balanceGiver(r.left));

        }
        else if(search(r.right,key)){
            System.out.println(key+" ka Balance factor was "+balanceGiver(r.right));
        }
        
        // left=search(r.left,key);    
        // right=search(r.right,key);
        // if(r==null)
        // else
        // {
        //         left = depth(r.left);
        //         right = depth(r.right);
        //         balance=left-right;
        //         System.out.println(balance);
        // }
        // if(balance==1 || balance==(-1) || balance ==0){
        // }
        // else

    }
    



    public static void main(String args[]) {
        int ch,e,node;
        Scanner in = new Scanner(System.in);
        BinaryTree obj = new BinaryTree();
        obj.createTree();
        do {
            System.out.println("\n1.Insert\n2.Inorder\n3.Search\n4.Count\n5.Depth \n6.Balance Check \n7.Balance Check, enter node:\n0.Exit\n:");
            ch = in.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter data:");
                    e = in.nextInt();
                    Dnode n=new Dnode(e);//n(150)
                    obj.insert(obj.root,n);//insert((100),n(150))
                    System.out.println("Data to inserted");
                    break;
                case 2:
                    System.out.println("Data in inorder:");
                    obj.inorder(obj.root);//inorder(root:100)
                    break;
                case 3:
                    System.out.println("Enter data to search:");
                    e = in.nextInt();
                    System.out.println(e+" Found in tree:"+ obj.search(obj.root,e));
                    break;
                case 4:
                    System.out.println("Total nodes :"+obj.count(obj.root));
                    break;

                    case 5:
                    System.out.println("Total nodes :"+(obj.depth(obj.root)-1));
                    break;    
                

                    case 6:
                    if(obj.balance(obj.root)){
                        System.out.println("Tree is balanced");
                    }
                    else
                    System.out.println("Unbalanced Tree");
                    
                    break;


                    case 7:
                    System.out.println("Enter a Node to find it's factor:");
                    node = in.nextInt();
                    obj.balanceNode(obj.root,node);
                    break;

                case 0:
                    System.out.println("Exiting.....");
                    break;
                default:
                    System.out.println("Wrong option selected");
                    break;
            }
        } while (ch != 0);
    }


}
