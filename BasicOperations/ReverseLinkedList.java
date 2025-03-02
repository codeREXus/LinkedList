package BasicOperations;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Operations obj= new Operations();
        ReverseLinkedList ll= new ReverseLinkedList();
        obj.addLast(12);
        obj.addLast(123);
        obj.addLast(1234);
        obj.addLast(12345);
        obj.display();
        obj.head=reverse(obj.head);
        obj.display();
    }
    static node reverse(node head){
            node curr= head;
        if(curr.next==null || curr==null){
            return curr;
        }
        node temp = reverse(curr.next);
        curr.next.next=curr;
        curr.next=null;
        return temp;
    }
}
