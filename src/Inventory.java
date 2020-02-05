import java.util.ArrayList;

class Inventory {
	
	public static int checkItem(int x, int y, String item,
            ArrayList<String> inventory, Area[][] room, int score) {
		
		
		boolean validRoomItem = false;
		for (String roomItems : room[x][y].items ) {               //Code to check if the item is actually in the room
			if (roomItems.equals(item)) {
				validRoomItem = true;
				break;
			}
		}
		
	
		boolean inInventory = false;
		for (String itemInInv: inventory) {
			if (itemInInv.equals(item)) {                      //Code to check if the item is already in the inventory
				inInventory = true;
				break;
			}
		}
		
		
		if (!inInventory && validRoomItem) {
			
			System.out.println("You pick up the " + item + ".");          //If item is picked up print this
			inventory.add(item);
			score += 10;
			Areas.removeItem(room, x, y, item);
		}
		else if (inInventory) {
			System.out.println("You already have the " + item + ".");      //If item is already in inventory print this
		}
		else if (!validRoomItem) {
			System.out.println("You don't see that here.");           //If item doesn't exist print this
		}
		else {
			System.out.println("Cannot do this");              //Incorrect command
		}
		
		return score;
    }

    public static void print(ArrayList<String> inventory) {

        System.out.println("Inventory:");
        for (String item : inventory) {
            System.out.println(item);
        }
    }
}