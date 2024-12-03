public class Monster extends GameCharacter {
    private String location;
    private String weakness;

    public Monster(String name, int level, int maxHP, double currentHP, String type, String location, String weakness) {
        super(name, level, maxHP, currentHP, type);
        this.location = location;
        this.weakness = weakness;
    }

    @Override
    public String toString() {
        return super.toString() + " located at " + location + " with weakness: " + weakness;
    }

    @Override
    public void heal(double amount) {
        double newHP = getCurrentHP() + amount;
        double damageTaken = getMaxHP() - newHP; // Calculate the damage taken
        if (newHP > getMaxHP()) {
            setCurrentHP(getMaxHP()); // Heal to full
        } else {
            // Check if a potion was used and heal accordingly
            if (damageTaken > 0) {
                double healedAmount = damageTaken * 0.1; // Heal to 10% of the damage taken
                setCurrentHP(newHP + healedAmount);
            } else {
                double healedAmount = damageTaken * 0.5; // Heal to 50% of the damage taken
                setCurrentHP(newHP + healedAmount);
            }
        }
    }
}

       