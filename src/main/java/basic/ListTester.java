package basic;

import java.util.ArrayList;
import java.util.List;

public class ListTester {

	public static void main(String[] args) {
		List<String> batsman =new ArrayList<String>();
		batsman.add("Well");
		batsman.add("come");
		batsman.add("dhoni");
		batsman.add("kohli");
		batsman.add("ashwin");
		
		List<String> bowler =new ArrayList<String>();
		bowler.add("dhoni");
		bowler.add("sachin");
		bowler.add("kohli");
		bowler.add("dhawan");
		
		ListProgram lp=new ListProgram();
		System.out.println(batsman+":list of batsman");
		System.out.println(bowler+":list of bowlers");
		List<String> allrounder=lp.commonArray(batsman, bowler);
		System.out.println(allrounder+"commonArray");
		 lp.removeElements(batsman, bowler);
		System.out.println(batsman+"after removing");
		System.out.println(bowler+":after removind ");
		// TODO Auto-generated method stub

	}

}
