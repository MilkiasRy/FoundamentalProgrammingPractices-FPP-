package lab9_4;

public class NodeQueue {
	/* stores the element at the front of the queue, if it exists */
	private Node head;
	
	/* stores the element at the end of the queue, if it exists */
	private Node tail;
	public NodeQueue() {
		head=null;
		tail=null;
	}
	/**
	 * Inserts a new node containing s at end of queue
	 */
	public void enqueue(String s) {
		
		//implement
		Node temp= tail;
		tail=new Node();
		tail.data=s;
		tail.next=null;
		if(isEmpty())head=tail;
		else {
		temp.next=tail;
	}	}
	
	/**
	 * Removes node from the front of the queue and returns its value if
	 * head is n
	 */
	public String dequeue() throws QueueException {
		if(isEmpty()) throw new QueueException("Queue is empty!");
		String data=head.data;
		head=head.next;
		if(isEmpty())
	tail=null;
		return data;
	}	
	/**
	 * Returns value stored at the front of the queue
	 * @return
	 * @throws QueueException
	 */
	public String peek() throws QueueException {
		if(isEmpty()) throw new QueueException("Queue is empty!");
		return null;
	}
	public boolean isEmpty() {
		return head == null;
	}
	@Override
	public String toString() {
		if(isEmpty()) return "<empty queue>";
		return head.toString();
	}
}


