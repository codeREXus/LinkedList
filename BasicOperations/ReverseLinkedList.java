package BasicOperations;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Operations obj= new Operations();
        obj.addLast(12);
        obj.addLast(123);
        obj.addLast(1234);
        obj.addLast(12345);
        obj.display();
        obj.head=reverse1(obj.head);
        obj.display();
        obj.head= reverse2(obj.head);
        obj.display();
    }
    static node reverse1(node head){
        // recursive approach
        node curr= head;
        if(curr.next==null || curr==null){
            return curr;
        }
        node temp = reverse1(curr.next);
        curr.next.next=curr;
        curr.next=null;
        return temp;
    }
    static node reverse2(node head){
        // itterative approach
        node prev= null;
        node curr= head;
        while(curr!=null){
            node next=curr.next;
            curr. next = prev;
            prev= curr;
            curr= next;
        }
        return prev;
    }
}
