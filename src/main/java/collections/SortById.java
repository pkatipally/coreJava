package collections;

import java.util.Comparator;

public class SortById implements Comparator<SortStudent>{
	public int compare(SortStudent s1,SortStudent s2){
		return s1.id.compareTo(s2.id) ;
	}

}
