public class PythagoreanTheorem {
    public double calucalateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across the right angle. 
        // calculate the value of c given legA and legB
        return Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
    }
}