package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudentTester {
	public static void main(String args[]){
		List<SortStudent> studentlist=new ArrayList<SortStudent>();
		studentlist.add(new SortStudent("1234","2012","India"));
		studentlist.add(new SortStudent("1235","2014","London"));
		studentlist.add(new SortStudent("1236", "1987", "Kerala"));
		
		Collections.sort(studentlist,new SortById());
		System.out.println("Sort by an id");
		for(SortStudent s:studentlist){
			System.out.println(s.address+" id: "+s.id+", year:"+s.year);
		}
		
	}

}
