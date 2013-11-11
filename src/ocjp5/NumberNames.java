package ocjp5;

import java.util.HashMap;
import java.util.Set;

public class NumberNames {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private HashMap<String, Integer> map = new HashMap<String, Integer>();

	public void put(String name, int value) {
		map.put(name, value);
	}

	public Set<String> getNames() {
		return map.keySet();
	}
}
