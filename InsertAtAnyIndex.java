package LinkedList;
class SLL2{
    Node head;
    Node tail;
    void insert(int val){
        Node temp = new Node(val);
        if(head==null){
            head=temp;
            tail=head;
        }else {
            tail.next=temp;
            tail=temp;
        }
    }
    void insertatany(int indx,int val){
        Node temp= new Node(val);
        Node x=head;
        for(int i=0; i<=indx-1; i++){
            x=x.next;
        }
        temp.next=x.next;
        x.next=temp;
    }
}
public class InsertAtAnyIndex {
    public static void main(String[] args) {

    }
}
