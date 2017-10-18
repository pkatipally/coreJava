package excercises;

public class EvenOdd {
	
	public static void printEvenOdd(int arr[]){
	for(int i=0;i<arr.length;i++){
	if(arr[i]%2==0){
		System.out.println("Given number "+ arr[i]+" is even ");
	}
	else{
		System.out.println("Given number "+arr[i]+" is odd");
	}
	}
}

public static void main(String args[]){
	int[] arr={4,22,43,65,76,31};
	printEvenOdd(arr);
}
}