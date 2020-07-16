public class Gorilla extends Mammal {
    public Gorilla(int energyLevel){
        super();
        super.setMammal(energyLevel + super.getMammal());
    }
    public Gorilla throwSomething() {
        int oldEnergy = this.energyLevel;
        this.energyLevel -= 5;
        String modifierMessage = String.format("A BAD gorilla is threw something...Current Energy Level: %d, Now Energy Level: %d", oldEnergy, this.energyLevel);
        System.out.println(modifierMessage);
        return this;
    }
    public Gorilla eatBanana() {
        int oldEnergy = this.energyLevel;
        this.energyLevel += 10;
        String modifierMessage = String.format("A GOOD gorilla is eating a Banana and is Happy...Current Energy Level: %d, Now Energy Level: %d", oldEnergy, this.energyLevel);
        System.out.println(modifierMessage);
        return this;
    }
    public Gorilla climb() {
        int oldEnergy = this.energyLevel;
        this.energyLevel -= 10;
        String modifierMessage = String.format("A gorilla is climbing a Tree...Current Energy Level: %d, Now Energy Level: %d", oldEnergy, this.energyLevel);
        System.out.println(modifierMessage);
        return this;
    }
}