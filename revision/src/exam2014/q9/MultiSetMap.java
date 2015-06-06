package exam2014.q9;

import java.util.HashMap;
import java.util.Map;

public class MultiSetMap implements MultiSet {
	private Map<String, Integer> myMap;

	MultiSetMap() {
		myMap = new HashMap<String, Integer>();
	}

	@Override
	public int size() {
		int total = 0;
		for (String key : myMap.keySet()) {
			total += myMap.get(key);
		}
		return total;
	}

	@Override
	public boolean contains(String s) {
		return myMap.containsKey(s);
	}

	@Override
	public int occurrences(String s) {
		int occur = 0;
		if (this.contains(s)) {
			occur = myMap.get(s);
		}
		return occur;
	}
	
	@Override 
	public boolean remove( String s) {
		boolean present = contains(s);
		if (present) {
			int occur = this.occurrences(s);
			if (occur==1) {
				myMap.remove(s);
			} else {
				myMap.put(s, occur-1);
			}
		}
		return present;
	}
	
	@Override
	public void add( String s) {
		int occur = this.occurrences(s) ;
		myMap.put(s, occur + 1);  
	}
	
	@Override
	public String toString() {
		return myMap.toString();
	}

}
