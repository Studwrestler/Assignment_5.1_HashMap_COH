import java.util.HashMap;

/**
 * This is the dictionary class that creates a dictionary hash map for archaic
 * words
 * 
 * @author Chase
 *
 */
public class Dictionary {
	private HashMap<String, String> dictionary;// Hash map used to create the dictionary has keys

	/**
	 * Used to create a dictionary
	 */
	public Dictionary() {
		dictionary = new HashMap<>();

		dictionary.put("thou", "you (subject pronoun)");
		dictionary.put("thee", "you (object pronoun)");
		dictionary.put("thy", "your");
		dictionary.put("ye", "you (plural)");
		dictionary.put("art", "are");
	}// end constructor

	/**
	 * prints the unsorted dictionary
	 */
	public void printDictionary() {
		System.out.println("Unsorted Dictionary");
		for (String word : dictionary.keySet()) {
			System.out.println(word + " - " + dictionary.get(word));
		}
	}// end printDictionary

	/**
	 * searches for a certain word in the dictionary
	 * 
	 * @param word searched to find wanted word
	 * @return the searched for word
	 */
	public String searchWord(String word) {
		return dictionary.get(word);
	}// end searchWord

	/**
	 * get the hash key for the inputed word
	 * 
	 * @param word you want the hash key for
	 * @return the hash code for the word
	 */
	public int getHashKey(String word) {
		return word.hashCode();
	}// end getHashKey

}// end class
