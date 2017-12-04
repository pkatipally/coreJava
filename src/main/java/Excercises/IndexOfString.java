package excercises;

public class IndexOfString {
	/* This method  read the index and print the characters  by taking input n from user */

	public int getIndex(String name,int n){
		int counter = 0;
		for(int i=0;i<name.length();i++){		
			if(n==name.charAt(i)){			
				return i;		
			}
			for(int j=i;j<name.length();j++){
				if(n==name.charAt(j)){
					
					counter++;
				}
			}
		}	
				return -1;
	
}
	public static void main(String args[]){
		String name="javaprogram";
		IndexOfString index=new IndexOfString();
		System.out.println(index.getIndex(name, 0));
	}
}
