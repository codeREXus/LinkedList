package BasicOperations;

public class RemoveDuplicate {
    public static void main(String []args){
        Operations obj = new Operations();
        obj.add();
        obj.display();
        removeDuplicate(obj.head);
        obj.display();
    }
    static void removeDuplicate(node head){
        node curr= head;
        while(curr!=null && curr.next!=null){
            if(curr.data==curr.next.data)
            curr.next=curr.next.next;
            else
            curr= curr.next;
        }
    }
}
