import java.util.ArrayList;
import java.util.List;

public abstract class GameCharacter {
    private String name;
    private int level;
    private int maxHP;
    private double currentHP;
    private String type;
    private List<Item> inventory;

    // Constructor
    public GameCharacter(String name, int level, int maxHP, double currentHP, String type) {
        this.name = name;
        this.maxHP = maxHP;
        this.currentHP = currentHP;
        this.type = type;
        this.level = level; // Initialize level with the provided value
        this.inventory = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public double getCurrentHP() {
        return currentHP;
    }

    public String getType() {
        return type;
    }

    // List Method
    public void getLoot(Item item) {
        inventory.add(new Item(item));
    }

    public void listInventory() {
        System.out.println(name + "'s Inventory: ");
        for (Item item : inventory) {
            System.out.println(item);
        }
    }

    // Setters
    public void setName(String aHName) {
        name = aHName;
    }

    public void setMaxHP(int aHMaxHP) {
        maxHP = aHMaxHP;
    }

    public void setCurrentHP(double aHCurrentHP) {
        currentHP = aHCurrentHP;
    }

    public void setType(String aHType) {
        type = aHType;
    }

  
    // Abstract heal method
    public abstract void heal(double amount);

    // Copy Constructor and ToString
    public GameCharacter(GameCharacter otherCharacter) {
        this.name = otherCharacter.name;
        this.level = otherCharacter.level;
        this.maxHP = otherCharacter.maxHP;
        this.currentHP = otherCharacter.currentHP;
        this.type = otherCharacter.type;
        this.inventory = new ArrayList<>(otherCharacter.inventory);
    }

    public String toString() {
        return name + " is a level " + level + " " + type + " with " + currentHP + "/" + maxHP + " health points";
    }
}
