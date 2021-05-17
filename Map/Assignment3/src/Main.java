import java.util.Hashtable;

import wipro.StateProperties;

public class Main {
	public static void main(String[] args) {
		Hashtable<String, String> hash = new Hashtable<>();
		StateProperties properties = new wipro.StateProperties(hash);
		properties.saveProperty("Rajasthan", "Jaipur");
		properties.saveProperty("MP", "Bhopal");
		properties.saveProperty("Punjab", "handigarh");
		properties.saveProperty("Himachal", "Shimala");
		properties.saveProperty("J & K", "Shrinagar");
		properties.iterate();
	}
}
