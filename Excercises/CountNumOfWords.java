package excercises;

public class CountNumOfWords {
	int numOfWords = 0;
	 int charCount=0;
	private int spaceCount=0;
	private int numbers=0;
	private int spacialChar;
	private int other;
	private int spacialSymbols;
	public void getNumCharSpace(String sentence){
		for(int i=0;i<sentence.length();i++){
			 numOfWords=sentence.charAt(i);
			 if((numOfWords>=65 && numOfWords<=90)||(numOfWords>=91 && numOfWords<=122)){	
				charCount++;
			 }
			 else if(numOfWords==32){
				  spaceCount++;
			 }
			 else if(numOfWords>='0' && numOfWords<='9'){
				 numbers++;
			 }
			 else if(numOfWords>=33 && numOfWords<=46) {
				 spacialChar++;
			 }
			 else if(numOfWords>=47 && numOfWords<=64){
				 spacialSymbols++;
			 }
			
			 else{
		 other++;
	}
		}
		 System.out.println(charCount+spaceCount+numbers+spacialChar+spacialSymbols+other);
			
		}
}