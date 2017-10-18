package excercises;

import java.util.*;

public class FindMiddleElementOfLinkedList {
	public static void main(String args[]){
		List<String> linkedList=new LinkedList<String>();
		linkedList.add("apple");
		linkedList.add("banana");
		linkedList.add("blueberry");
		linkedList.add("orange");
		linkedList.add("strawberry");
		linkedList.add("raspberry");
		linkedList.add("cherries");
		linkedList.add("watermelon");
		linkedList.add("peach");
		linkedList.add("grapes");
		linkedList.add("mango");
		linkedList.add("pineapple");
		linkedList.add("cantaloupe");
		linkedList.add("kiwi");
		linkedList.add("abc");
		linkedList.add("aaa");
		linkedList.add("bbb");
		linkedList.add("ccc");
		linkedList.add("cdd");
		linkedList.add("cvv");
		linkedList.add("zzz");
		linkedList.add("xnc");
		linkedList.add("asd");
		linkedList.add("adreg");
		
		System.out.println("Before printing time in sec:" + System.currentTimeMillis());
		System.out.println("Size of the list:" + (linkedList.size()));
		System.out.println(linkedList);
		String middleElement = linkedList.get(linkedList.size() / 2);
		System.out.println(middleElement);
		System.out.println("afer code -current time in milli sec:" + System.currentTimeMillis());
	}

}
