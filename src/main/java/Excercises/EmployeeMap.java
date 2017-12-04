package excercises;

import java.util.HashMap;
import java.util.Set;

public class EmployeeMap {

	public static void main(String args[]) {
		HashMap<String, String> map = new HashMap<String, String>();

		map.put("a1234", "Steve jobs");
		map.put("a1235", "Scott McNealy");
		map.put("a1236", "Jeff Bezos");
		map.put("a1237", "Larry Ellison");
		map.put("a1238", "Bill Gates");

		System.out.println(map);
		System.out.println("Value of first entry:" + map.get("a1234"));
		// print all values using loop
		Set<String> keys = map.keySet();
		for (String entry : keys) {
			String value = map.get(entry);
			System.out.println("Value Of:" + entry + " is " + value);
		}
	}


}
