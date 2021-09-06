package hashtable;

import java.util.ArrayList;

public class MyLinkedHashMap<k,v> {
	private final int numBuckets;
	ArrayList<MyLinkedList<k>> myBucketArray;
	
	public MyLinkedHashMap() {
		this.numBuckets = 10;
		this.myBucketArray = new ArrayList<>(numBuckets);	//array list initialization with size 10
		for(int i= 0;i<numBuckets;i++)
			this.myBucketArray.add(null);	
	}
	
	/**
	 * @method to convert key to index using hashCode   
	 * @param key
	 * @return index
	 */
	private int getBucketIndex(k key)
	{
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % numBuckets;
		System.out.println("Key: "+key+", HashCode:"+hashCode+", index:"+index);
		return index;
	}
	
	/**
	 * @method add creates a new node if the key is not found
	 * else it will set the updated value
	 * uses hashCode to store index
	 * @param key
	 * @param value
	 */
	public void add (k key, v value)
	{
		int index=this.getBucketIndex(key); 
		MyLinkedList<k> myLinkedList = this.myBucketArray.get(index);

		if (myLinkedList == null){
			myLinkedList = new MyLinkedList<>();
			this.myBucketArray.set(index, myLinkedList);
		}
		MyMapNode<k, v> myMapNode = (MyMapNode<k,v>) myLinkedList.search(key);
		if (myMapNode == null)
		{ 
			myMapNode = new MyMapNode<>(key,value); 
			myLinkedList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}

	/**
	 * @param key
	 * @return either null or existing value
	 */
	public v get(k key) {

		int index = this.getBucketIndex (key);
		MyLinkedList<k> myLinkedList = this.myBucketArray.get(index); 
		if(myLinkedList == null) 
			return null;
		MyMapNode<k,v> myMapNode = (MyMapNode<k,v>) myLinkedList.search(key);
		return (myMapNode == null) ? null: myMapNode.getValue();
	}
	
	public String toString() {
		return "MyLinkedHashMap List{"+myBucketArray+ '}';
	}
}
