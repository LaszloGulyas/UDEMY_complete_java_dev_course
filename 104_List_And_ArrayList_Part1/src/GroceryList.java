import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("\nYou have " + groceryList.size() + " elements on your list.");
        for(int i=0; i<groceryList.size(); i++) {
            System.out.println(" " + (i+1) + ".) " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        if(position <1 || position >groceryList.size()) {
            System.out.println("\nIncorrect item index. Nothing changed.");
        } else {
            groceryList.set(position - 1, newItem);
            System.out.println("\nItem nr. " + (position) + " has been updated to: " + newItem);
        }
    }

    public void removeGroceryItem(int position) {
        if(position <1 || position >groceryList.size()) {
            System.out.println("\nIncorrect item index. Nothing changed.");
        } else {
            groceryList.remove(position-1);
            System.out.println("\nItem nr. " + (position) + " has been removed from the list.");
        }
    }

    public String findItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position >=0) {
            return groceryList.get(position);
        }

        return null;
    }
}
