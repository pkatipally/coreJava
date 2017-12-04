package basic;

import java.util.Scanner;

public class FindPalindromeTester {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter String");
		FindPalindrome palindrome=new FindPalindrome();
		String name=scan.next();
		
		if(palindrome.isPalindrome(name)){
			System.out.println("Entered String is "+name+" palindrome");
		}
		else{
			System.out.println("Entered String is "+name+" not a palindrome");
		}
		
		if(palindrome.isPalindrome2(name)){
			System.out.println("Entered String is "+name+" palindrome");
		}
		else{
			System.out.println("Entered String is "+name+" not a palindrome");
		}
		
		scan.close();
	}

	

}
