public class HumanTest {
    public static void main(String[] args) {
        Human testHuman = new Human();
        Human testHumanOne = new Human();
        Human testHumanTwo = new Human();
        testHuman.displayHuman();
        testHumanOne.attack(testHumanTwo);
        testHumanTwo.displayHuman();
    }

}