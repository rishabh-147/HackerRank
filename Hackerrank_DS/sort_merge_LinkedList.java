package Hackerrank_DS;
import java.util.*;
public class sort_merge_LinkedList{
		static class Node{
			int data;
			Node next;
			
			public Node(int user_data)
			{
				this.data = user_data;
				this.next = null;
			}
		}
    public static void main(String args[]){
        Node List_head1 = null;
        Node List_head2 = null;
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-- > 0)
        {
            List<Integer> L = new ArrayList<>();
            int n = ob.nextInt();
           
            while(n-- > 0)
            {  int a = ob.nextInt();
                
                	List_head1 = insert(List_head1, a, L);
                L.add(a);
                
            }
                int m = ob.nextInt();
           
            while(m-- > 0)
            {	
            	int b = ob.nextInt();
        	List_head2 = insert(List_head2, b, L);
            
        	L.add(b);
            }
            //Put into array sort it
            //create a new linked list with elements of that array
       //    display(List_head1);
         //  display(List_head2);
           
           
           L = sort(L);
        	
            Node new_head = null;
            for(int i : L) {
            	new_head = insert(new_head, i);
            //	System.out.println(i+"@@");
            }
           
            display(new_head);
          
          }
}
    
    public static Node insert(Node head, int d, List<Integer> list)
    {
    	Node temp = new Node(d);
    	if(head == null) {
    		head = temp;
    	}
    	else {
    		Node current = head;
    		while(current.next != null)
    		{	
    			current = current.next;
    		}
    		current.next = temp;
    	}
    	
    	return head;
    }
    
    public static Node insert(Node head, int d)
    {
    	Node temp = new Node(d);
    	if(head == null) {
    		head = temp;
    	}
    	else {
    		Node current = head;
    		while(current.next != null)
    		{	
    			current = current.next;
    		}
    		current.next = temp;
    	}
    	
    	return head;
    }
    
    public static List<Integer> sort(List<Integer> list){
    	
    	for(int i = 0; i < list.size() - 1 ; i++)
    	{
    		for(int j = 0; j < list.size() - 1 - i; j++) {
    			if(list.get(j) > list.get(j + 1)) {
    			int temp = list.get(j);
    			list.set(j, list.get(j + 1));
    			list.set(j + 1, temp);
    		}
    		}
    	}
    	return list;
    }
    
    public static void display(Node head) {
    	Node current = head;
    	while(current != null) {
    		System.out.print(current.data + " ");
    		current = current.next;
    	}
    	System.out.println();
    }
}