package excercises;

import java.util.Scanner;

public class FindAnagramTester {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter two strings");
		String name=scan.next();
		String anagram=scan.next();
		FindAnagram findAnagram=new FindAnagram();
		
		if(findAnagram.isAnagram(name, anagram)){
			System.out.println("Entered Strings "+name+","+anagram+" are anagrams. ");
		}
		else{
			System.out.println("Entered Strings "+name+","+anagram+" are not anagrams.");
		}
		scan.close();
	}

}
