public class Human {
    protected int strength;
    protected int stealth;
    protected int intelligence;
    protected int health;

    public Human(){
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;
    }

    public Human(int strength, int stealth, int intelligence, int health) {
        this.strength = 3 + strength;
        this.stealth = 3 + stealth;
        this.intelligence = 3 + intelligence;
        this.health = 100 + health;
    }
    
    public Human attack(Human attackedHuman) {
        attackedHuman.health -= this.strength;
        return this;
    }

    public Human displayHuman() {
        String humanDetailsMessage = String.format("Strength: %d, Stealth: %d, Intelligence: %d, Health: %d", this.strength, this.stealth, this.intelligence, this.health);
        System.out.println(humanDetailsMessage);
        return this;
    }
}