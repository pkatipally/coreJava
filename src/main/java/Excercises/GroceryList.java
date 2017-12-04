package excercises;

import java.util.ArrayList;

public class GroceryList {
	private ArrayList<String> groceryList = new ArrayList<String>();

	public void addGroceryItem(String item) {
		groceryList.add(item);
	}

	public void printGroceryList() {
		System.out.println("My List Contains " + groceryList.size() + " Grocery Items");
		for (int i = 0; i <= groceryList.size(); i++) {
			String myItem = groceryList.get(i);
			System.out.println((i+1) + " Items is " + myItem);
		}
	}

	public void modifyList(int position, String newItem) {
		groceryList.set(position, newItem);
		System.out.println("GroceryItem " +( position+1 )+ " has been changed with item " + newItem);
	}

	public void removeItem(int position) {
		String removeItem = groceryList.get(position);
		System.out.println("removed item " + removeItem);
		groceryList.remove(position);
	}

	public String findItem(String searchItem) {
		int position=groceryList.indexOf(searchItem);
		if(position>=0){
	return groceryList.get(position);
			}
		return null;
	}

}
