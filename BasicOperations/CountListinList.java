package BasicOperations;

public class CountListinList {
    // public static void main(String[] args)throws Exception{
    //     Operations obj= new Operations();
    //     int cnt= count(obj.head);
    //     System.out.println(cnt);
    // }
    int count(node head,node target){
        int cnt=0;
        while(head!=null){
            if(isMatch(head,target)){
                cnt+=1;
            }
            head= head.next;
        }
        return cnt;
    }
    Boolean isMatch(node head, node target){
        while(target!= null){
            if(head== null || target.data!= head.data){
                return false;
            }
            head= head.next;
            target= target.next;
        }
        return true;
    }
}
