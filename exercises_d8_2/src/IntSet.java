public interface IntSet {
	void add(int val); //adds a new int to the set; if it is there already, nothing happens.
	boolean contains(int val); //returns true if the number is in the set, false otherwise.
	boolean containsVerbose(int val); 	// returns the same values as the former method, but for every element that is checked prints its value on screen.
	String toString(); // returns a string with the values of the elements in the set separated by commas.
}
