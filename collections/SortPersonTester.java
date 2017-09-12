package collections;

import java.util.*;


public class SortPersonTester {
	public static void main(String args[]) {
		List<SortPerson> list = new ArrayList<SortPerson>();
		list.add(new SortPerson("raj", 20));
		list.add(new SortPerson("priya", 25));
		list.add(new SortPerson("rajitha", 22));
		list.add(new SortPerson("ranu", 20));
	//	for(int i=0;i<list.size();i++){
		//	SortPerson result=list.get(i);
		Collections.sort(list);
		for(SortPerson p:list){
			System.out.println(p.name+""+p.age);
		}

	}
}


