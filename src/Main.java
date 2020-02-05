import java.util.ArrayList;
import java.util.Scanner;

public class Main {



	public static void main(String args[]) {
		

		
    	
		
        // Build rooms
        final int WIDTH = 3;
        final int HEIGHT = 3;
        Area[][] room = new Area[WIDTH][HEIGHT];
        Areas.build(room, WIDTH, HEIGHT);
        int x = 0;
        int y = 0;
        int points = 0;

        // Load inventory
        ArrayList<String> inventory = new ArrayList<>();
        

        
        
        
        // Title Screen
       
    	
        {
            Scanner readline = new Scanner(System.in);
            String jobName = "";
            String Name = "";
            System.out.println("What is your name adventurer?");
            Name = readline.nextLine();
            System.out.println(Name + " what style of combat are you trained in?");
            System.out.println("---------------------------------------");
            System.out.println("Are you a mighty Knight? a wise Wizard perhaps?");
            System.out.println("Or");
            System.out.println("just some noob...");
            System.out.println("A) Knight");
            System.out.println("B) Wizard");
            jobName = readline.nextLine();
            System.out.println(Name + jobName);
            Playable mainChar = new Playable(Name, jobName + "Hello");
            System.out.println(Name + " the " + jobName + " Your adventure begins");
            
        }

    	
    	
    	
    	// Print starting room description
    	Areas.print(room, x, y );

        // Start game loop
        boolean playing = true;
        while (playing) {

        	// Get user input
            String input = Input.getInput();

            // Movement commands
            if (input.equals("n")) {
                if (y > 0) {
                    y--;
                    Areas.print(room, x, y);
                } else {
                    System.out.println("You can't go that way.");
                }
            } else if (input.equals("s")) {
                if (y < HEIGHT - 1) {
                    y++;
                    Areas.print(room, x, y);
                } else {
                    System.out.println("You can't go that way.");
                }
            } else if (input.equals("e")) {
                if (x > 0) {
                    x--;
                    Areas.print(room, x, y);
                } else {
                    System.out.println("You can't go that way.");
                }
            } else if (input.equals("w")) {
                if (x < WIDTH - 1) {
                    x++;
                    Areas.print(room, x, y);
                } else {
                    System.out.println("You can't go that way.");
                }
            }

            // Look commands
            else if (input.equals("look")) {
                Areas.print(room, x, y);
            }
            

            // Get commands
            else if (input.length() > 4  && input.substring(0, 4).equals("get ")) {
            	if (input.substring(0, input.indexOf(' ')).equals("get")) {
            		if (input.substring(input.indexOf(' ')).length() > 1) {
            			String item = input.substring(input.indexOf(' ') + 1);
                    	points = Inventory.checkItem(x, y, item, inventory, room, points);
            		}	
            	}
            }

            // Inventory commands
            else if (input.equals("i") || input.equals("inv")
                    || input.equals("inventory")) {
                Inventory.print(inventory);
            }
            
            else if (input.equals("score")) {
            	System.out.println("Score: " + points + "/500");
            }
          
            else if (input.equals("stats")) {
            	return	;
            	}
            
            
            else if (input.equals("restart")) {
            	System.out.println();
            	Main.main(args);
            }

            
            
            else if (input.equals("help")) {
            	System.out.println("Type 'n'/'e'/'s'/'w' to move");
            	System.out.println("Type 'look' for a reminder of the area that you're in");
            	System.out.println("Type 'get' + item to pick up an item");
            	System.out.println("Type 'i' to view your inventory");
            	System.out.println("Type 'score' to view your score");
            	System.out.println("Type 'restart' to restart the game");
            	System.out.println("Type 'quit' to quit the game");
            }
            
            // Quit commands
            else if (input.equals("quit")) {
                System.out.println("Goodbye!");
                playing = false;

            // Catch-all for invalid input
            } else {
                System.out.println("You can't do that.");
            }
        }
        System.exit(0);
    }
}


