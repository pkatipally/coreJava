package excercises;

import java.util.*;
import java.util.Map;

public class PassingIntPrintWordsMap {
	public static void main(String args[]){
		Map<Integer,String> intToStringMap=new HashMap<Integer,String>();
		intToStringMap.put(1, "One");
		intToStringMap.put(2, "Two");
		intToStringMap.put(3, "Three");
		intToStringMap.put(4, "Four");
		intToStringMap.put(5,"Five" );
		System.out.println(intToStringMap);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter integer to get the word");
		int key=scan.nextInt();
	
		if(intToStringMap.containsKey(key)){
			System.out.println(intToStringMap.get(key));
		}
		else{
			System.out.println("Sorry,Please enter correct integer");
		}
	}

}
