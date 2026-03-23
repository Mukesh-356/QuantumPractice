import java.util.*;
class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data=data;
    }
}
public static void main(String[] args)
{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        ListNode head=null;
        ListNode tail=null;
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            ListNode nnode=new ListNode(data);
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
        ListNode temp=head;
        while(temp!=null)
            {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
