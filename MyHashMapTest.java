package hashtable;

/**
 * MyHashMapTest class contains main function 
 * has function to perform counting of words in a sentence
 * it outputs linked list of hash map values
 * prints the hash map 
 * @author Mohammad Musthafa
 */

public class MyHashMapTest {
	public static void findFrequency1() {
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
	
	public static void findFrequency2() {
		String sentence= "“Paranoids are not paranoid because they are paranoid but because "
				+ "they keep putting themselves deliberately into paranoid avoidable situations";
		String[] words = sentence.toLowerCase().split(" ");
		
		MyHashMap<String,Integer> myLinkedHashMap = new MyHashMap<>();
		for(String word:words) {
			Integer value = myLinkedHashMap.get(word);
			if(value == null) 
				value = 1;
			else 
				value = value + 1;
			myLinkedHashMap.add(word,value);
		}
		System.out.println(myLinkedHashMap);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//findFrequency1();
		findFrequency2();
	}

}
