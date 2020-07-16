public class Mammal {
    protected int energyLevel;

    // getter
    public int getMammal(){
        this.energyLevel = 100;
        return this.energyLevel;
    }

    // setter
    public void setMammal(int energyLevel){
        this.energyLevel = energyLevel;
    }

    public Mammal displayEnergy(){
        String modifierMessage = String.format("Current Energy Level: %d", this.getMammal());
        System.out.println(modifierMessage);
        return this;
    }
}