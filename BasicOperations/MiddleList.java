package BasicOperations;

public class MiddleList {
    public static void main(String[] args) throws Exception{
        Operations obj = new Operations();
        obj.add();
        obj.display();
        int middle = middle(obj.head);
        System.out.println(middle);
    }
    static int middle(node head){
        node slow= head, fast= head;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
}
