package BasicOperations;

import java.util.*;
public class Operations {
    node head;
    node tail;
    int size=0;
    Operations(){
        head=tail=null;
        size=0;
    }
    public void add() throws Exception {
        boolean flag= true;
        Scanner sc = new Scanner(System.in);
        while(flag){
            System.out.print("enter 0 for new data and -1 to exit ");
            System.out.println();
            int choice= sc.nextInt();
            if(choice==0){
                int data= sc.nextInt();
                node newNode = new node(data);
                if (head == null) {
                    head = newNode;
                } 
                else {
                    node temp = head;
                    while (temp.next != null) {
                        temp = temp.next;
                    }
                temp.next = newNode;
                }
            }
            else 
            if(choice ==-1){
                break;
            }
            else{
                System.out.println("enter correct value");
            }
        }
        sc.close();
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
    public void addLast(int data){
        node n = new node(data);
        node temp=head;
        if(size==0){
            head=n;
            tail=n;
        }
        else{
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
        tail=n;
        }
        size+=1;
    }

    public void addAt(int data, int k){
        node temp = head;
        node n = new node(data);
        
        if(k==0){
            addFirst(data);
        }
        else if(k==size){
            addLast(data);
        }
        else{
            while(k>1){
                k--;
                temp=temp.next;
            }
            n.next=temp.next;
            temp.next=n;
            size++;
        }
    }
    
    public void getFirst() throws Exception{
        if(size==0){
            throw new Exception("LinkedList is Empty");
        }
        System.out.println(head.data);
    }
    public void getLast() throws Exception{
        if(size==0){
            throw new Exception("LinkedList is Empty");
        }
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public void getAt(int k) throws Exception{
        if(size==0){
            throw new Exception("LinkedList is epxty");
        }
        if(k>size){
            throw new Exception("Index out of bound");
        }
        node temp= head;
        while(k>1){
            k--;
            temp=temp.next;
        }
        System.out.println(temp.data+" (0 based indexing)");
    }
    
    public void deleteFirst() throws Exception{
        if(size==0){
            throw new Exception("LinkedList is Empty");
        }
        head=head.next;
        size--;
    }
    public void deleteLast() throws Exception{
        if(size==0){
            throw new Exception("LinkeList is empty");
        }
        node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        size-=1;
    }
    public void deleteAt(int k) throws Exception{
        if(size==0){
            throw new Exception("Linked List is empty");
        }
        if(k>size){
            throw new Exception("Index out of Bounds");
        }
        if(k==0){
            deleteFirst();
        }
        else if(k==size){
            deleteLast();
        }
        else{
            node temp = head;
            while(k>1){
                temp=temp.next;
                k-=1;
            }
            temp.next=temp.next.next;
            size-=1;
        }
    }        
    
    
    public int getSize(){
        return size;
    }

    public void display(){
        node temp= head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
}
