import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data)
        {
            this.data=data;
        }
}


public  class LinkedList
{

    public static Node insertHead(Node head,int data)
    {
        Node temp=new Node(data);
        if(head==null)
        {
            return temp;
        }

        else {
            Node temp_node=head;
            while(temp_node.next!=null)
            {
                temp_node=temp_node.next;
            }
            temp_node.next=temp;
            return head;
        }
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count=scan.nextInt();
        Node head=null;
        while(count-->0)
        {
            head=insertHead(head,scan.nextInt());

        }

        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }

    }
}
