package BasicOperations;

public class ConverSinglyList {
    public static void main(String[] args) throws Exception{
        Operations obj =  new Operations();
        obj.add();
        convert(obj.head);
    }
    static void convert(node head){
        node curr= head;
        if(head== null)
            return;
        while(curr.next!= null){
            curr= curr.next;
        }
        curr.next=head;
    }
}
