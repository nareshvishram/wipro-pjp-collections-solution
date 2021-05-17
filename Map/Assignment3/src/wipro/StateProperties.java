package wipro;

import java.util.Enumeration;
import java.util.Hashtable;

public class StateProperties {
	public Hashtable<String, String> hashtable;

	public StateProperties(Hashtable<String, String> hashtable) {
		this.hashtable = hashtable;
	}

	public void saveProperty(String state, String capital) {
		hashtable.put(state, capital);
	}

	public void iterate() {
		Enumeration<String> states = hashtable.keys();
		while (states.hasMoreElements()) {
			String state = states.nextElement();
			System.out.println("State -> " + state + " , " + " Capital -> " + hashtable.get(state));
		}
	}
}
