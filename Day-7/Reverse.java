import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public static void main(String[] args)
{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Node head=null;
        Node tail=null;
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            Node nnode=new Node(data);
            if(head==null){
                head=nnode;
                tail=nnode;
            }
            else{
                tail.next=nnode;
                tail=nnode;
            }
        }
        head=reverse(head);
            Node temp=head;
        while(temp!=null)
            {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
