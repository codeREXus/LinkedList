package BasicOperations;

public class CreateCycle {
    static void createCycle(node head, int target) throws Exception{
        if(head==null){
            throw new Exception("Cant create a cycle");
        }
        node temp= head;
        node cycletemp= null;
        int count =0;
        while(temp.next !=null ){
            if(count== target){
                cycletemp= temp;
            }         
            count+=1;
            temp= temp.next;
        }
        if(cycletemp!= null){
            temp.next=cycletemp;
        }

    }
}
