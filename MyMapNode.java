package hashtable;

public class MyMapNode<k,v> implements INode<k> {
	k key;
	v value;
	MyMapNode<k,v> next;
	
	public MyMapNode(k key,v value){
		this.key=key;
		this.value=value;
		next=null;
	}
	
	@Override
	public k getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public void setKey(k key) {
		// TODO Auto-generated method stub
		this.key=key;
	}

	@Override
	public INode<k> getNext() {
		// TODO Auto-generated method stub
		return next;
	}

	@Override
	public void setNext(INode<k> next) {
		// TODO Auto-generated method stub
		this.next = (MyMapNode<k,v>)next;
	}
	
	public v getValue() {
		return this.value;
	}
	
	public void setValue(v value) {
		this.value = value;
	}
	
	public String toString() {
		StringBuilder myMapNodeString = new StringBuilder();
		myMapNodeString.append("MyMapNode{" + "key= ").append(key)
		.append(", Value = ").append(value).append('}');
		if(next != null) {
			myMapNodeString.append("->").append(next);
		}
		return myMapNodeString.toString();
	}


}
