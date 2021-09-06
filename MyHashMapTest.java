package hashtable;

public class MyHashMapTest {
	public static void findFrequency() {
		String sentence="To be or not to be";
		String[] words = sentence.toLowerCase().split(" ");
		
		MyHashMap<String,Integer> myHashMap = new MyHashMap<>();
		for(String word:words) {
			Integer value = myHashMap.get(word);
			if(value == null) 
				value = 1;
			else 
				value = value + 1;
			myHashMap.add(word,value);
		}
		System.out.println(myHashMap);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findFrequency();
	}

}
