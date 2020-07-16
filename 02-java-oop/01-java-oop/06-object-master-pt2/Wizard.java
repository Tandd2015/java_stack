public class Wizard extends Human {
    public Wizard() {
        super(0,0,5,-50);
    }

    public Wizard heal(Human human) {
        human.health += this.intelligence;
        return this;
    }

    public Wizard fireball(Human human) {
        human.health -= (this.intelligence*3);
        return this;
    } 
}