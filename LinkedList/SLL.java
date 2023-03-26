
public class LL {
	/// initializing linked list
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next=next;
		}
	}
	
	//////////////Print the element in SLL
	///////////// Finding the length of the SLL
	public void display() {
		ListNode curr = head;
		int count=0;
		while(curr != null) {
			count++;
			System.out.print(curr.data+"--> ");
			curr=curr.next;
		}
		System.out.println("null");
		System.out.println("Length: "+count);
	}
	
	// Inserting a node at beginning////////////
	public void insertBeginning(int value) {
		ListNode newadd=new ListNode(value);
		newadd.next=head;
		head=newadd;
		display();
	}
	
	///////////Inserting a node a at ENd/////////
	public void insertEnd(int value) {
		ListNode newadd = new ListNode(value);
		if(head == null) {
			head = newadd;
			return;
		}
		ListNode curr = head;
		while(curr.next != null) {
			curr=curr.next;
		}
		curr.next=newadd;
		display();
	}
	
	//// Insert node at a given position//////
	public void insertatPosition(int value, int position) {
		ListNode newadd = new ListNode(value);
		if(position==1) {
			insertBeginning(value);
		}else {
			ListNode previous = head;
			int count =1;
			while(count<position-1) {
				previous=previous.next;
				count++;
			}
			ListNode temp = previous.next;
			newadd.next = temp;
			previous.next=newadd;
		}
		display();
		}
		
	//// Insert node at a given position//////
		public void DelFirst() {
			if(head==null) {
				System.out.println("LL is empty");
			}
			ListNode temp= head;
			head = head.next;
			temp.next=null;
			display();
		}	
	
	////////// Delete at end
		public void DelLast() {
			if(head == null) {
				System.out.println("LL is empty");
			}
			ListNode curr = head;
			ListNode prev = null;
			while(curr.next != null) {
				prev = curr;
				curr=curr.next;
			}
			prev.next = null;
			display();
		}

	///// Delete at any position
		public void DelAtanyPos(int position) {
			if(position == 1) {
				DelFirst();
			}else {
				ListNode curr =head;
				int count =1;
				while(count <position-1) {
					curr=curr.next;
					count++;
				}
				ListNode temp = curr.next;
				curr.next = temp.next;
			}
			display();
		}
		
	////////////Search for ele
		public boolean Search(int search) {
			ListNode curr = head;
			while(curr != null) {
				if(curr.data == search) {
					return true;
				}
				curr=curr.next;
			}
			return false;
		}
		
	/////////// Reverse the Linkedlist
		public void reverse() {
	        ListNode prev = null;
	        ListNode curr = head;
	        ListNode next = null;
	        while (curr != null) { // 1->2->3->4 curr = 1 //curr=2
	        	next = curr.next; // making copy of 2->3->4 (next nodes)
	        	curr.next = prev;// breaking link between 1 and 2
	            prev = curr; //prev will be update to curr so next node will be add to front of head
	            curr = next; // curr will be updated to 2
	        }
	        head = prev; 
	    }
	
	
public static void main(String[] args) {
	LL sll = new LL();
	sll.head = new ListNode(1);
	ListNode sec = new ListNode(2);
	ListNode third = new ListNode(8);
	
	//next
	sll.head.next = sec;
	sec.next = third;
	System.out.println("Linked List");
	sll.display();
	
	System.out.println("\nInserting in Beginning");
	sll.insertBeginning(5);
	
	System.out.println("\nInsertinf At the End");
	sll.insertEnd(111);

	System.out.println("\nInserting at any Position");
	sll.insertatPosition(12,3);

	System.out.println("\nDeleteing head");
	sll.DelFirst();

	System.out.println("\nDeleting last");
	sll.DelLast();

	System.out.println("\nDeleting from given position");
	sll.DelAtanyPos(3);

	System.out.println("\nSearch for a key");
	System.out.println(sll.Search(12));
	
	System.out.println("\nReverse a SLL");
	sll.reverse();
	sll.display();
}

}
