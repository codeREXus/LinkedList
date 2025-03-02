package BasicOperations;
import java.util.*;
public class CountOccurences {
    public static void main(String[] args) {
        Operations obj = new Operations();
        Scanner sc = new Scanner(System.in);
        obj.addLast(1);
        obj.addLast(1);
        obj.addLast(2);
        obj.addLast(2);
        obj.addLast(3);
        obj.addLast(3);
        obj.addLast(5);
        obj.addLast(4);
        obj.display();
        System.out.println("enter target");
        int target=sc.nextInt();
        int count = frequency(target,obj.head);
        System.out.println("count is "+ count);
    }
    static int frequency(int target,node head){
        node curr= head;
        int count=0;
        while(curr!=null){
            if(curr.data==target){
                count+=1;
            }
            curr=curr.next;
        }
        return count;
    }
}
