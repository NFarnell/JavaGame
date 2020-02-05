import java.util.ArrayList;

class Rooms {

    public static void build(Room[][] room, final int WIDTH, final int HEIGHT) {

    	
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                room[i][j] = new Room(i, "", "", null);    //Room creation
            }
        }

        room[0][0].setNumber(1);
        room[0][0].setName("Forest");
        room[0][0].setDescription("You are lost in a forest!");
        room[0][0].setInstruction("Which direction will you travel?");
        room[0][0].setItems("Sword");
        room[0][0].setItems("Potion");

        room[0][1].setNumber(2);
        room[0][1].setName("Castle");
        room[0][1].setDescription("You have entered the castle, something feels wrong about this place...Something evil");
        room[0][1].setInstruction("Which direction will you travel?");
        room[0][1].setItems("Rock");
        room[0][1].setItems("torch");

        room[1][0].setNumber(3);
        room[1][0].setName("Cave");
        room[1][0].setDescription("You are in a cave. Something is moving in the darkness!");
        room[1][0].setInstruction("Which direction will you travel?");
        room[1][0].setItems("Bow");
        room[1][0].setItems("Arrows");

        room[1][1].setNumber(4);
        room[1][1].setName("Throne Room");
        room[1][1].setDescription("The skeleton king appears!");
        room[1][1].setInstruction("Which direction will you travel?");
        room[1][1].setItems("Rope");
        room[1][1].setItems("Poison");
        
        room[2][0].setNumber(5);
        room[2][0].setName("Maze");
        room[2][0].setDescription("O no! A Maze!");
        room[2][0].setInstruction("Which direction will you travel?");
        room[2][0].setItems("Rope");
        room[2][0].setItems("Poison");
        
        room[2][1].setNumber(5);
        room[2][1].setName("Treasure Room");
        room[2][1].setDescription("The skeleton kings treasure");
        room[2][1].setInstruction("Which direction will you travel?");
        room[2][1].setItems("Gold");
        room[2][1].setItems("(L) Skeleton Kings Chestplate");
        room[2][1].setItems("(L) Skeleton Kings Rapier");
        room[2][1].setItems("(L) Skeleton Kings Gauntlets");
        
    }

    public static void print(Room[][] room, int x, int y) {

    	System.out.println();
        System.out.println(room[x][y].getDescription());
        System.out.println(room[x][y].getInstruction());
        System.out.println("You see some items which may be of use " + room[x][y].getItems());
    }

    // Remove item from room when added to inventory
    public static void removeItem(Room[][] room, int x, int y, String item) {
    	
    	room[x][y].deleteItem(item);
    }
}

class Room {

    private int number;
    private String name;
    private String description;
    private String instruction;
    public ArrayList<String> items = new ArrayList<>();

    public Room(int number, String name, String description,
            ArrayList<String> items) {
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getInstruction() {
        return this.instruction;
    }

    public void setItems(String item) {
        this.items.add(item);
    }

    public void deleteItem(String item) {
        this.items.remove(item);
    }

    public ArrayList<String> getItems() {
        return this.items;
    }
}
