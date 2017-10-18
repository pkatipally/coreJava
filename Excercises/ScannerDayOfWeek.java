package excercises;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ScannerDayOfWeek {
	public static void main(String args[]) {
		int number=0;
		Scanner scan = new Scanner(System.in);		
		/*To put Boundary conditions here we use If condition  */
		if(number<1||number>7){
			System.out.println("Please enter the number in between 1-7 .");
		}
		try{
		 number = scan.nextInt();
		System.out.println(getDayOfWeek(number));
		}
		catch(InputMismatchException e){
			System.out.println("");
		}
		scan.close();
	}
/*This method  give dayoftheweek by taking "n" as input from user  */
	public static String getDayOfWeek(int n) {
		switch (n) {
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Tuesday";
		case 4:
			return "Tuesday";
		case 5:
			return "Tuesday";
		case 6:
			return "Tuesday";
		case 7:
			return "Tuesday";
		default:
			return "number not found";
		}
	}
}
