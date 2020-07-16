public class Ninja extends Human {
    public Ninja() {
        super(0,7,0,0);
    }

    public Ninja steal(Human human) {
        human.health -= this.stealth;
        this.health += this.stealth;
        return this;
    }

    public Ninja runAway() {
        this.health -= 10;
        return this;
    }

}