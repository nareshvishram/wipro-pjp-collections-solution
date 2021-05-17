package wipro;

import java.util.Map;

public class Solution {

	public Map<String, Integer> map;

	public Solution(Map<String, Integer> map) {
		this.map = map;
	}

	public void saveDetails(String name, int phone) {
		map.put(name, phone);
	}

	public boolean isKeyExist(String key) {
		return map.containsKey(key.trim());
	}

	public boolean isValueExist(int phone) {
		return map.containsValue(phone);
	}

	public void iterate() {
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " --> " + e.getValue());
		}

	}

}
