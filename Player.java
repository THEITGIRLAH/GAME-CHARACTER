public class Player extends GameCharacter {
    private int experiencePoints;

    public Player(String name, int level, int maxHP, double currentHP, String type, int experiencePoints) {
        super(name, level, maxHP, currentHP, type);
        this.experiencePoints = experiencePoints;
    }

    @Override
    public String toString() {
        return super.toString() + " with " + experiencePoints + " experience points";
    }

    @Override
    public void heal(double amount) {
        double newHP = getCurrentHP() + amount;
        // Check if newHP exceeds the maximum HP
        if (newHP > getMaxHP()) {
            setCurrentHP(getMaxHP()); // Heal to full
        } else {
            setCurrentHP(newHP); // Heal for the calculated amount
        }
    }

}
