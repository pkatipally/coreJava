package collections;

import java.util.*;

public class Names {
	String num = "2";
	String result = "";

	public static void main(String args[]) {
		Names names = new Names();
		names.printappend();

	}

	public void printappend() {
		List<String> namesList = new ArrayList<String>();
		namesList.add("java");
		namesList.add("class");
		namesList.add("jvm");
		namesList.add("2");
		System.out.println(namesList);
		System.out.println("index of number 2:" + namesList.indexOf(num));
		for (int i = 0; i < namesList.size(); i++) {
			result = namesList.get(i);
			System.out.println(result);
		}
			System.out.println("remove number from list:" + namesList.remove(3));
			
			for(String result:namesList){
				System.out.println(result);
				
			}

		
	}

}
