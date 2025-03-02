package BasicOperations;

public class RemoveKthNode {
    public static void main(String[] args) throws Exception{
        Operations obj = new Operations();
        obj.addLast(1);
        obj.addLast(12);
        obj.addLast(123);
        obj.addLast(1234);
        remove(1,obj.head);
        obj.display();
    }
    static void remove(int k,node head){
        node curr= head;
        int size=0;
        while(curr!=null){
            curr=curr.next;
            ++size;
        }
        curr= head;
        if(size==0){
            System.out.println("LinkedList is empty");
        }
        if(k==0){
            curr= curr.next;
            head= curr;
            size-=1;
        }
        else if(k==size){
            while(curr.next.next!=null){
                curr= curr.next;
            }
            size-=1;
            curr.next=null;
        }
        else{
            curr=head;
            while(k>1){
                curr= curr.next;
                k-=1;
            }
            curr.next=curr.next.next;
            size-=1;
        }
    }
}
