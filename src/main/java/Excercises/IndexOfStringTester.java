package excercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IndexOfStringTester {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		
		String name="javaProgram";
		FindIndex index=new FindIndex();
				
		System.out.println("Please enter a character");
		
		try{
		char character=scan.next().charAt(0);		
		System.out.println("Position of the char is :");
		System.out.println(index.getIndex(name,character));
		}
		catch(InputMismatchException e){
			System.out.println(" Your input is not a character please enter char ");
		}
		
		scan.close();
		
		
	}

}
