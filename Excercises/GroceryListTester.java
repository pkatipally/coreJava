package excercises;

import java.util.Scanner;

public class GroceryListTester {
	private static Scanner scan=new Scanner(System.in);
	private static	GroceryList groceryItemList=new GroceryList();
	public static void main(String args[]){
	boolean quit=false;
	int choice=0;
	printInstructions();
	
	while(!quit){
		System.out.println("Enter your choice here:");
		choice =scan.nextInt();
		scan.nextLine();
		switch(choice){
		case 0:
			printInstructions();
			break;
		case 1:
			groceryItemList.printGroceryList();
			break;
		case 2:
			addItem();
			break;
		case 3:
			modifyList();
			break;
		case 4:
			removeItem();
			break;
		case 5:
			searchForItem();
			break;
		case 6:
			quit=true;
			break;
				
		}
	}
		
	}
	private static void addItem() {
		System.out.println("Please enter the grocery item: ");
		groceryItemList.addGroceryItem(scan.nextLine());
	}
	private static void removeItem() {
		System.out.println("Please enter the grocery item position to remove the item: ");
		int itemNum=scan.nextInt();
		scan.nextLine();
		groceryItemList.removeItem(itemNum);
	}
	private static void modifyList() {
		System.out.println("Enter item number to modify the place:");
		int itemNum=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter replacement item:");
		String newItem=scan.nextLine();
		groceryItemList.modifyList(itemNum-1, newItem);
		
	}
	private static void searchForItem() {
		System.out.println("Enter item to search:");
		String findItem=scan.nextLine();
		if(groceryItemList.findItem(findItem) != null){
			System.out.println("found "+findItem+" in our grocery list.");
		}
		else{
			System.out.println(findItem+" is not in the grocerylist.");
		}
	}
	private static void printInstructions() {
		System.out.println("press");
		System.out.println("0-To print choice options:");
		System.out.println("1-To print the list of grocery items:");
		System.out.println("2-To add an item to list");
		System.out.println("3-To modify the item in the list");
		System.out.println("4-To remove the item in the list");
		System.out.println("5-To find the item in the list");
		System.out.println("6-To quit the application");
		
	}

}
