public class HumanTest {
    public static void main(String[] args) {
        Human testHuman = new Human();
        Human testHumanOne = new Human();
        Human testHumanTwo = new Human();

        Ninja testNinja = new Ninja();
        Ninja testNinjaOne = new Ninja();

        Wizard testWizard = new Wizard();

        Samurai testSamurai = new Samurai();
        // Samurai testSamuraiOne = new Samurai();
        Samurai testSamuraiTwo = new Samurai();


        // testHuman.displayHuman();
        // testHumanOne.attack(testHumanTwo);
        
        // testNinjaOne.steal(testHumanTwo).steal(testHumanTwo).runAway().displayHuman();
        
        // testNinja.steal(testHumanTwo);
        // testNinja.displayHuman();
        
        
        // testWizard.fireball(testHumanTwo).displayHuman();
        testHumanTwo.displayHuman();
        testSamurai.displayHuman();
        testSamurai.deathBlow(testHumanTwo).meditate().meditate().displayHuman();
        testHumanTwo.displayHuman();
        testSamurai.howMany();
    }

}