

//Implement an algorithm to find the nth to last element of a singly linked list
public class LinkedList {

	static class node{
	int value;
	node next;
	
	public node(int value) {
		this.value = value;
	}
	
}
	static int findnthtolastelem(node head, int n) {
		
		node pointer1 = head;
		node pointer2= head;
		
		
		for(int i =0; i<n;i++) {
			pointer2= pointer2.next;
			
		}
		while(pointer2!=null) {
			pointer1=pointer1.next;
			pointer2=pointer2.next;
		}
		return pointer1.value;
		
		
	}
static void printList(node head) {
		
		
		while(head!=null) {
			System.out.println(head.value+" ");
			head = head.next;
			
		}
	}
	public static void main (String[] args){
	
	node start = new node(10);
	start.next = new node(9); 
    start.next.next = new node(9); 
    start.next.next.next = new node(18); 
    start.next.next.next.next = new node(166); 
    start.next.next.next.next.next = new node(14); 

    printList(start); 
    System.out.println();
    System.out.println("Linked list before removing duplicates :"); 
    System.out.println(findnthtolastelem(start,1));

	}

}