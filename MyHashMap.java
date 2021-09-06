package hashtable;

public class MyHashMap<k,v> {
	MyLinkedList<k> myLinkedList;
	
	//non parameterized constructor to create object of MyLinkedList
	public MyHashMap() {
		this.myLinkedList = new MyLinkedList<>();
	}

	/**
	 * @method add creates a new node if the key is not found
	 * else it will set the updated value
	 * @param key
	 * @param value
	 */
	public void add(k key, v value) {
		MyMapNode<k,v> myMapNode = (MyMapNode<k,v>) this.myLinkedList.search(key);
		if(myMapNode == null) {
			myMapNode = new MyMapNode<>(key,value);
			this.myLinkedList.append(myMapNode);
		}else {
			myMapNode.setValue(value);
		}
	}

	/**
	 * @param key
	 * @return either null or existing value
	 */
	public v get(k key) {
		MyMapNode<k, v> myMapNode = (MyMapNode<k, v>) this.myLinkedList.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public String toString() {
		return "MyHashNodes{" + myLinkedList.printMyNodes() + '}';
	}
}
