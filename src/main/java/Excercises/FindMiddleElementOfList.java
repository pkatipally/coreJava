package excercises;

import java.util.ArrayList;
import java.util.List;

public class FindMiddleElementOfList {
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("html");
		list.add("jquery");
		list.add("bootstrap");
		list.add("css");
		list.add("sql");
		list.add("angular");
		list.add("js");
		list.add("c");
		list.add("java1");
		list.add("html1");
		list.add("jquery1");
		list.add("bootstrap1");
		list.add("css1");
		list.add("sql1");
		list.add("angular1");
		list.add("js1");
		list.add("c++");
		list.add("java2");
		list.add("html2");
		list.add("jquery2");
		list.add("bootstrap2");
		list.add("css2");
		list.add("sql2");
		list.add("angular2");
		list.add("js2");
		list.add("c2");
		System.out.println("Before printing time in sec:" + System.currentTimeMillis());
		System.out.println("Size of the list:" + (list.size()));
		System.out.println(list);
		String middleElement = list.get((list.size() / 2));
		System.out.println(middleElement);
		System.out.println("afer code -current time in milli sec:" + System.currentTimeMillis());

	}

}
