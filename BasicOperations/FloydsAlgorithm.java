package BasicOperations;

public class FloydsAlgorithm {
    public static void main(String [] args)throws Exception{
        Operations obj = new Operations();
        obj.add();
        obj.display();
        //int pos= 3;
        //createCycle(obj.head, 10);
        Boolean flag= false;
        flag= cycle(obj.head);
        System.out.println(flag);
        int start= checkStart(obj.head);
        System.out.println("Start of the cycle is from: "+ start);
        System.out.println(" List after removal of cycle");
        //obj.display();
    }
    
    static Boolean cycle(node head){
        node slow= head, fast= head;
        while(fast!=null && fast.next!= null){
            if(slow== fast){
                return true;
            }
            slow= slow.next;
            fast= fast.next.next;
        }
        return false;
    }
    static int checkStart(node head){
        if(cycle(head)== true){
            node slow= head;
            node fast= head;
            while(fast!=null && fast.next!= null){
                slow= slow.next;
                fast=fast.next.next;
                if(slow== fast){
                    return start(head,slow, fast);                  
                }
            }
        }
        return -1;
    }
    static int start(node head, node slow, node fast){
        slow= head;
        int res=0;
        while(slow!=fast){
            slow= slow.next;
            fast= fast.next;
            if(slow==fast){
                res= slow.data;
            }
        }
        return res;
    }
}
