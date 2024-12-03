import java.util.ArrayList;
import java.util.List;

public class MyDriver {
    public static void main(String[] args) {
        // Create a Player
        GameCharacter gameCharacter1 = new GameCharacter("Alice", 5, 100, 75.0, "Warrior");

        // Create some items
        Item sword = new Item("Sword", 10.0);
        Item potion = new Item("Health Potion", 0.5);

        // Add items to the player's inventory
        gameCharacter1.getLoot(sword);
        gameCharacter1.getLoot(potion);

        // Display the player's information and inventory
        System.out.println(gameCharacter1);
        gameCharacter1.listInventory();

        // Create a list of GameCharacter objects
        List<GameCharacter> characters = new ArrayList<>();

        // Add three Monster objects
        characters.add(new Monster("Monster1", 10, 50, 40.0, "Dragon", "Dark Cave", "Fire"));
        characters.add(new Monster("Monster2", 8, 45, 30.0, "Zombie", "Haunted House", "Silver Bullets"));
        characters.add(new Monster("Monster3", 12, 60, 55.0, "Ghost", "Abandoned Mansion", "Holy Water"));

        // Add five Player objects
        characters.add(new Player("Player1", 5, 100, 75.0, "Warrior", 500));
        characters.add(new Player("Player2", 7, 120, 90.0, "Mage", 750));
        characters.add(new Player("Player3", 6, 110, 80.0, "Rogue", 600));
        characters.add(new Player("Player4", 4, 80, 60.0, "Archer", 400));
        characters.add(new Player("Player5", 8, 140, 100.0, "Paladin", 900));

        // Loop through the array (or ArrayList) and print each of the objects
        for (GameCharacter character : characters) {
            System.out.println(character);
            if (character instanceof Player) {
            System.out.println("Player's experience points: " + (Player)character).getExperiencePoints());
            }
            if (character instanceof Monster) {
                System.out.println("Monster's location: " + ((Monster) character).getLocation());
                System.out.println("Monster's weakness: " + ((Monster) character).getWeakness());
            }
            System.out.println();
        }
    }
}
