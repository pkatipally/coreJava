package excercises;

public class Sorting {
	public static int getAnElement(){
		int output=0;
	int [] arr={2,5,4,9};
	for(int i=0;i<arr.length;i++){
	
		 if(output<=arr[i]){
			 int temp=arr[i];
			 output=arr[i];
			 temp=output;
			 System.out.println(arr[i]);
		 }
	}
	
	return output;
	

}
	public static void main (String args[]){
		System.out.println(getAnElement());
	}

}