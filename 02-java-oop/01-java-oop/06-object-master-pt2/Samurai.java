public class Samurai extends Human {
    protected static int samuraiCount;
    public Samurai() {
        super(0,0,0,100);
        samuraiCount+=1;
    }

    public Samurai deathBlow(Human human) {
        human.health -= human.health;
        this.health = this.health/2;
        return this;
    }

    public Samurai meditate() {
        this.health = (this.health+=this.health/2);
        return this;
    }

    public static int howMany() {
        System.out.println(samuraiCount);
        return samuraiCount;
    }
}