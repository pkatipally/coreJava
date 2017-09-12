package map;

import java.util.HashMap;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

public class Tester {
	public static void main(String args[]) {
		Map<Employee, Department> employeeDeptMap = new HashMap<Employee, Department>();
		Employee e1 = new Employee();
		e1.setName("raj ");
		e1.setId(2020);
		Employee e2 = new Employee();
		e2.setName("jack ");
		e2.setId(2023);
		Employee e3 = new Employee();
		e3.setName("arya");
		e3.setId(2024);
		Department d1 = new Department();
		d1.setName("IT ");
		d1.setSalary(50000);
		Department d2 = new Department();
		d2.setName("Police");
		d2.setSalary(40000);
		Department d3 = new Department();
		d3.setName("Doctor");
		d3.setSalary(90234);
		employeeDeptMap.put(e1, d1);
		employeeDeptMap.put(e2, d2);
		employeeDeptMap.put(e3, d3);
		System.out.println(employeeDeptMap);
		Set<Employee> keys = employeeDeptMap.keySet();
		Set<Entry<Employee, Department>> entrySet = employeeDeptMap.entrySet();
		for (Entry<Employee, Department> entry : entrySet) {
			entry.getKey();
			entry.getValue();
		}
		List<Employee> keyList = new ArrayList<Employee>();
		keyList.addAll(keys);
		Collections.sort(keyList);
		for (Employee key : keyList) {
			System.out.println(key);

		}
	}
}
