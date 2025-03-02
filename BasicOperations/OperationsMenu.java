package BasicOperations;

public class OperationsMenu {
    public static void main(String[] args) {
    Operations obj= new Operations();
    obj.addFirst(1000);
    obj.addFirst(100);
    obj.addFirst(10);
    obj.display();
    obj.addLast(1000);
    obj.addLast(100);
    obj.addLast(10);
    obj.display();
    obj.addAt(0,0);
    obj.addAt(30, 4);    
    obj.display();
    
    }
}
