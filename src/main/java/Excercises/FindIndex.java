package excercises;

public class FindIndex {
	
	public int getIndex(String name,int n){
		for(int i=0;i<name.length();i++){		
			if(n==name.charAt(i)){
				return i;		
			}
		}	
				return -1;
}
}