import java.util.*;
class Node {
    int data;
    Node next;
    Node(int m) {
        data=m;
        next=null;
    }
}
public class Middle
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Node head=null;
        Node tail=null;
        for(int i=0;i<n;i++)
            {
            int tem=sc.nextInt();
            Node node=new Node(tem);

            if(head==null){
                head=tail=node;
            } else{
                tail.next=node; 
                tail=node;
            }
        }
        Node a=head;
        Node b=head;
        
        while(b!=null && b.next!=null)
            {
            a=a.next;
            b=b.next.next;
        }

        System.out.print(a.data);
    }
}