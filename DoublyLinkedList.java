
public class DoublyLinkedList 
{
	Node head;
	Node tail;
	int size;
	class Node
	{
		int data;
		Node prev;
		Node next;
		
		Node(int val)
		{
			data = val;
		}
	}
	public DoublyLinkedList() 
	{
		head = null;
		tail = null;
	}
	
	public void insertAtBegining(int value) {
		size++;
		Node newNode = new Node(value);
		if(head==null) 
		{
			head=newNode;
			tail=newNode;
		}else {
			newNode.next = head;
			head.prev=newNode;
			head=newNode;
		}
	}
	
	public void insertAtEnd(int value) {
		size++;
		Node newNode = new Node(value);
		if(head==null){
			insertAtBegining(value);
		}else {
			newNode.prev=tail;
			tail.next=newNode;			
		}
		tail=newNode;
	}
	
	public void insertAtPosition(int position,int value) 
	{
		size++;
		Node newNode = new Node(value);
		Node temp=head;
		if(head==null||position==0){
			insertAtBegining(value);
		}
		else if(size==position+1){
			insertAtEnd(value);
		}
		else {
			for(int i=1;i<position;i++) {
				temp=temp.next;
			}
		newNode.next=temp.next;
		newNode.prev=temp;
		temp.next.prev=newNode;
		temp.next=newNode;
		
		//temp=newNode;
		}
	}
	
	public void deleteAtPosition(int position) {
		Node temp=head;
		Node previous=head;
		for(int i=1;i<=position;i++) {
			previous=temp;
			temp=temp.next;
		}
		previous.next=temp.next;
		temp.next.prev = previous;
	}
	
	public void display(){
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	//	System.out.println("size"+size);
	}
	
	public void revDisplay(){
		Node temp = tail;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.prev;
		}
	}
}
