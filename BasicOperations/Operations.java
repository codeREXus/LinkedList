package BasicOperations;

public class Operations {
    node head;
    node tail;
    int size=0;
    Operations(){
        head=tail=null;
        size=0;
    }
    public void addFirst(int data){
        node n= new node(data);
        n.next=head;
        head=n;
        if(size==0){
            tail=n;
        }
        size+=1;
    }

    
    public void display(){
        node temp= head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
