package basic;
import java.util.List;
import java.util.ArrayList;

public class ListProgram {
	public List <String> commonArray(List<String> batsman, List <String> bowler){
		List<String> allrounder=new ArrayList<String>();
		for (int i = 0; i < allrounder.size(); i++) {
			if(bowler.contains(batsman.get(i))){
			allrounder.add(batsman.get(i));
		}
		}return allrounder;

}
	public void removeElements(List<String>batsman,List<String>bowler){
		List<String> allrounder=commonArray(batsman,bowler);
		for (int i = 0; i < allrounder.size(); i++) {
			bowler.remove(allrounder.get(i));
					batsman.remove(allrounder.get(i));
		}
		
	}
}