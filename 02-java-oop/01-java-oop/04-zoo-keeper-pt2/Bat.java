public class Bat extends Mammal {
    public Bat(int energyLevel){
        super();
        super.setMammal(energyLevel + super.getMammal());
    }
    public Bat fly() {
        int oldEnergy1 = this.energyLevel;
        this.energyLevel -= 50;
        String batFlyMessage = String.format("the sound a bat taking off...Current Energy Level: %d, Now Energy Level: %d", oldEnergy1, this.energyLevel);
        System.out.println(batFlyMessage);
        return this;
    }
    public Bat eatHumans() {
        int oldEnergy2 = this.energyLevel;
        this.energyLevel += 25;
        String batEatMessage = String.format("the so-well, nevermind, just increasethe sound a bat taking off...Current Energy Level: %d, Now Energy Level: %d", oldEnergy2, this.energyLevel);
        System.out.println(batEatMessage);
        return this;
    } 
    public Bat attackTown() {
        int oldEnergy3 = this.energyLevel;
        this.energyLevel -= 100;
        String batAttackTownMessage = String.format("the sound of a town on fire...Current Energy Level: %d, Now Energy Level: %d", oldEnergy3, this.energyLevel);
        System.out.print(batAttackTownMessage);
        return this;
    }

    public Bat displayEnergy() {
        String displayedEnergy = String.format("Current Energy Level: %d", this.energyLevel);
        System.out.println(displayedEnergy);
        return this;
    }

}