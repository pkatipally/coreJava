package collections;

import java.util.*;


public class ElementCheck {
	public static void main(String args[]) {
		List<Character> numbers = new ArrayList<Character>();
		numbers.add('2');
		numbers.add('4');
		numbers.add('3');
		numbers.add('7');
		List<Character> even = new ArrayList<Character>();
		even.add('0');
		even.add('2');
		even.add('4');
		ElementCheck obj=new ElementCheck();
		obj.printElementCheck(numbers,even);
	}
	public void printElementCheck(List<Character>numbers,List<Character>even){
		System.out.println("Does numbers contains evennumbers ? "+numbers.containsAll(even));
		even.add('8');
		System.out.println("indexof numbers 4 is:"+numbers.indexOf('4'));
		System.out.println("even list:"+even);
	}

}
