package excercises;

import java.util.Scanner;

public class FactorialTester {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter number");
		int num=0;
		Factorial factorial=new Factorial();
		
		num=scan.nextInt();
		System.out.println("Factorial of "+num+" is:");
		System.out.println(factorial.factorial(num));
        scan.close();
	}

}
