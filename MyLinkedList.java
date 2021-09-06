package hashtable;


public class MyLinkedList<k>{

	public INode<k> head;
	public INode<k> tail;
	
	public MyLinkedList() {
		this.head = null;
		this.tail = null;	
	}
	
	
	/**
	 * @method appends an element to the linked list
	 * @param newNode contains new node value
	 */
	public void append(INode<k> newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	
	public INode<k> search(k Key) {
		INode<k> tempNode = head;
		while(tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey().equals(Key)){
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}
	
	
	public String printMyNodes() {
		return "My Nodes: "+head;
	}
	
}
