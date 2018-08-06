import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class BSTinorder{
    static void levelOrder(Node root){
        //Write your code here
        Queue q= new LinkedList();
        if(root !=null )
        {
            q.add(root);

            while(!q.isEmpty())
            {
                Node tree = (Node) q.remove();
                System.out.print(tree.data+" ");
            /*if( tree has non-empty left subtree ) {
                queue.enqueue( left subtree of t )
            }
            if( tree has non-empty right subtree ) {
                queue.enqueue( right subtree of t )
            }*/
                if(tree.left !=null)
                {
                    q.add(tree.left);
                }
                if(tree.right !=null)
                {
                    q.add(tree.right);
                }
            }


        }
}

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}