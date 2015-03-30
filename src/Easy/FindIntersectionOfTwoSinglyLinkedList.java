package Easy;
import CodeLibrary.*;

public class FindIntersectionOfTwoSinglyLinkedList {
	
	
	
public LinkedListNode getIntersectionNode(LinkedListNode headA, LinkedListNode headB) {
        
        int c1 = getCount(headA);
        int c2 = getCount(headB);
        int d=0;
        if(c1>c2){
            d=c1-c2;
            return _getIntersectionNode(d,headA,headB);
        }
        else{
            d=c2-c1;
            return _getIntersectionNode(d,headB,headA);
        }
        
    }
    
    
    
    public LinkedListNode _getIntersectionNode(int d, LinkedListNode HeadA, LinkedListNode HeadB){
        
       
        LinkedListNode current1 = HeadA;
        LinkedListNode current2 = HeadB;
        
        for(int i=0;i<d;i++)
        {
            if(current1==null)
                return null;
            current1=current1.next;
        }
        
        while(current1!=null && current2!=null){
            if(current1 == current2)
                return current1;
    
            current1 = current1.next;
            current2 = current2.next;
        }
        
        return null;
    }
    
    
    
    public int getCount(LinkedListNode X){
        int count = 0;
        while(X!=null){
            count++;
            X=X.next;
        }
        return count;
    }
}