package wipro;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
	public Map<String, String> m1;

	public Solution() {
		m1 = new TreeMap<>();
	}

	public void saveCoutryCapital(String countryName, String capitalName) {
		m1.put(countryName.toLowerCase(), capitalName.toLowerCase());
	}

	public String getCapital(String countryName) {
		countryName = countryName.trim().toLowerCase();
		if (countryName == null || countryName.length() == 0)
			return "No country found!";
		if (m1.containsKey(countryName)) {
			return captilize(m1.get(countryName));
		}
		return "No country found!";

	}

	public String getCountry(String capitalName) {
		capitalName = capitalName.trim().toLowerCase();
		if (capitalName == null || capitalName.length() == 0) {
			return "No capital name found!";
		}
		for (Map.Entry<String, String> e : m1.entrySet()) {
			if (e.getValue().toLowerCase().equals(capitalName)) {
				return captilize(e.getKey());
			}
		}
		return "No capital name found!";

	}

	public ArrayList<String> getAllCountry() {
		ArrayList<String> res = new ArrayList<>();
		for (Map.Entry<String, String> e : m1.entrySet()) {
			res.add(captilize(e.getKey()));
		}
		return res;
	}

	public Map<String, String> capitalCountry() {
		Map<String, String> m2 = new TreeMap<>();
		for (Map.Entry<String, String> e : m1.entrySet()) {
			m2.putIfAbsent(e.getValue(), e.getKey());
		}
		return m2;
	}

	public String captilize(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
}
