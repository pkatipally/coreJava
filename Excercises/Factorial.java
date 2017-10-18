package excercises;

public class Factorial {
	/* This method print the factorial by taking the number n from the user */			
	public long factorial(int n){
		long output=1;
		if(n==0){
			output=1;
		}
		else{
			output=n*(factorial(n-1));
		}
	System.out.println(output);
		return output;
		
	}

}
