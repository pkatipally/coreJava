package collections;

import java.util.*;

public class EmployeeTester {
	public static void main(String args[]){
		Employee employee1=new Employee();
		employee1.setname("jack");
		employee1.setemail("jack22@gmail.com");
		employee1.setid(24);
		
		Employee employee2=new Employee();
		employee2.setid(20);
		employee2.setname("jone");
		employee2.setemail("jone43@gmail.com");
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList.add(employee1);
		employeeList.add(employee2);
	System.out.println(employee1.equals(employee2)); 
	
		
	}

}
