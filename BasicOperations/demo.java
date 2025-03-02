package BasicOperations;

public class demo {
    public static void main(String[]args){
    node a= new node(1000);
    node b= new node(190);
    a.next=b;
    System.out.println(a.data);
    System.out.println(b.data);
    }
}