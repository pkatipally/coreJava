package excercises;


import java.util.*;
import java.util.Map.Entry;

public class EmployeeTester {
	public static Map<String,Employee> idToNameMap=new HashMap<String,Employee>();
	public static void main(String args[]){
		
		idToNameMap.put("a1234",new Employee("Steve Jobs"));
		idToNameMap.put("a1235",new Employee("Scott McNealy"));
		idToNameMap.put("a1236",new Employee("Jeff Bezos"));
		idToNameMap.put("a1237",new Employee("Larry Ellison"));
		idToNameMap.put("a1238",new Employee("Bill Gates"));
		
		System.out.println(idToNameMap);
		//checking if a key exists in map
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter the key to check in map ?");
		String id=scan.nextLine().toLowerCase();
		//Checking if key exists in Hashmap
		if(idToNameMap.containsKey(id)){
			System.out.println("True,Entered id is exist in Map");
		}
		else{
			System.out.println("False,What you entered is doesn't exist in Map ");
		}
	
	scan.close();
	}

}
