package exam2014.q9;

public interface MultiSet {
	// returns the size of the MultiSet
	int size();
	
	// Return true if s is in the MultiSet
	boolean contains( String s);
	
	// Return the number of occurrences of s in the MUltiset
	int occurrences( String s);
	
	// Add a new item to the MultiSet
	void add (String s);

	// Remove an item from the MultiSet
	boolean remove( String s);
}
