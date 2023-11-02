/**
 * This is the main method class that will use the dictionary class to create a hash map for archaic words
 * 
 * @author Chase
 *
 */
public class Application {
	/**
	 * Default
	 */
	Application() {

	}

	/**
	 * The main method for running the application.
	 *
	 * @param args The command-line arguments (not used in this application).
	 */
	
	public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        dictionary.printDictionary();

     
        String[] wordsToSearch = {"thou", "thee", "thy", "ye", "art"};
        System.out.println("\nSearch Results:");
        for (String word : wordsToSearch) {
            String definition = dictionary.searchWord(word);
            int hashKey = dictionary.getHashKey(word);
            System.out.println("Word: " + word);
            System.out.println("Definition: " + definition);
            System.out.println("Hash Key: " + hashKey);
            System.out.println();
        }
    }//end main

}//end class
