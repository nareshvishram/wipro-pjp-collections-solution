package wipro_hashmap_assignment;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public HashMap<String, String> map;

	public Solution(HashMap<String, String> map) {
		this.map = map;
	}

	public boolean isKeyExist(String key) {
		return map.containsKey(key);
	}

	public boolean isValueExist(String value) {
		return map.containsValue(value);
	}

	public void iterate() {
		for (Map.Entry<String, String> e : map.entrySet()) {
			System.out.println("Key -> " + e.getKey() + " ," + "Value -> " + e.getValue());
		}
	}

}
