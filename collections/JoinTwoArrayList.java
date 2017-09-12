package collections;

import java.util.ArrayList;
import java.util.List;

public class JoinTwoArrayList {
	public static void main(String args[]) {
		List<String> indians = new ArrayList<String>();
		indians.add("rama");
		indians.add("raj");
		indians.add("krishna");
		List<String> americans = new ArrayList<String>();
		americans.add("jack");
		americans.add("dicaprio");
		americans.add("bill");
		JoinTwoArrayList result = new JoinTwoArrayList();
		result.printJoinTwoArrayList(indians,americans);
	}

	public void printJoinTwoArrayList(List<String>indians,List<String>americans){
		List<String> al=new ArrayList<String>();
		al.addAll(indians);
		al.addAll(americans);
//		for(String output:al){
			System.out.println(al);
//		}
		
	}
}
