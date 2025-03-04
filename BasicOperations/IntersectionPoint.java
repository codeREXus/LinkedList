package BasicOperations;

public class IntersectionPoint {
    public static void main(String [] args)throws Exception{
        Operations obja= new Operations();
        Operations objb= new Operations();
        objb.add();
        node node1= obja.head;
        objb.add();
        node node2= objb.head;
        int l1= obja.getSize();
        int l2= objb.getSize();int res;
        if(l1>l2){
            res=findIntersection(l1-l2, node1, node2);
        }
        else{
            res=findIntersection(l2-l1, node2, node1);
        } 
        System.out.println("Intersection point of lists : " + res);
    }
    static int findIntersection(int diff, node head1, node head2){
        while(diff > 0){
            diff-=1;
            head1= head1.next;
        }
        while(head1 != head2){
            head1= head1.next;
            head2= head2.next;
        }
        return head1.data;
    }
}
