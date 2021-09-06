package hashtable;

public class MyHashMap<k,v> {
	MyLinkedList<k> myLinkedList;
	
	public MyHashMap() {
		this.myLinkedList = new MyLinkedList<>();
	}

	public void add(k key, v value) {
		MyMapNode<k,v> myMapNode = (MyMapNode<k,v>) this.myLinkedList.search(key);
		if(myMapNode == null) {
			myMapNode = new MyMapNode<>(key,value);
			this.myLinkedList.append(myMapNode);
		}else {
			myMapNode.setValue(value);
		}
	}

	public v get(k key) {
		MyMapNode<k, v> myMapNode = (MyMapNode<k, v>) this.myLinkedList.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public String toString() {
		return "MyHashNodes{" + myLinkedList.printMyNodes() + '}';
	}
}
