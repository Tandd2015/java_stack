public class PythagoreanTheoremTest {
    public static void main (String[] args) {
        PythagoreanTheorem one = new PythagoreanTheorem();
        
        Integer currentOne = (int) one.calucalateHypotenuse(4, 3);
        System.out.println(currentOne.toString());
    }
}