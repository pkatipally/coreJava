package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CommonList {
	public static void main(String args[]) {
		List<String> basketball = new ArrayList<String>();
		basketball.add("raj");
		basketball.add("jack");
		basketball.add("zoe");
		basketball.add("grace");

		List<String> football = new ArrayList<String>();
		football.add("zoe");
		football.add("raj");
		football.add("mark");
		football.add("burge");

		// System.out.println(basketball);
		// System.out.println(football);
		CommonList commonlist = new CommonList();
		commonlist.printCommonList(basketball, football);

	}

	private void printCommonList(List<String> basketball, List<String> football) {
		String result = "";
		for (int i = 0; i < basketball.size(); i++) {
			result = basketball.get(i);// here nested loop do check basketbball
										// "raj" throught football list ,if raj
										// match at any index it will print
			for (String output : football) {
				if (output.equals(result)) {
					System.out.println("common elements:" + result);
				}
			}
		}
		Iterator<String> basketballIterator = basketball.iterator();
		while (basketballIterator.hasNext()) {
			result = basketballIterator.next();
			Iterator<String> footballIterator = football.iterator();
			while (footballIterator.hasNext()) {
				String result1 = footballIterator.next();
				if (result.equals(result1)) {
					footballIterator.remove();
					basketballIterator.remove();
					System.out.println("after removing commonelements basketball:" + basketball);
					System.out.println("after removing commonelements football:"+football);

				}

			}
		}

	}

}