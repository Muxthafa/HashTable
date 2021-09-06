package hashtable;

/**
 * Interface for creating a node 
 * @param k of generic type
 */
public interface INode<k> {
	k getKey();
	void setKey(k key);
	
	INode<k> getNext();
	void setNext(INode<k> next);
}

