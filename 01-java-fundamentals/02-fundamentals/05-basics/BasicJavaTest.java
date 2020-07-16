import java.util.ArrayList; 
public class BasicJavaTest {
    public static void main(String[] args){
        BasicJava newBasicJava = new BasicJava();
        //1.
        String one = newBasicJava.printOneTo255(255);
        // System.out.println(one);
        //2.
        String two = newBasicJava.printOneTo255Odd(255);
        // System.out.println(two);
        //3.
        String three = newBasicJava.printSum(255);
        // System.out.println(three);
        //4.
        int [] newArray = {1,3,5,7,9,13};
        String four = newBasicJava.say(newArray);
        // System.out.println(four);
        //5.
        int [] newArray2 = {-3,-5,-7};
        String five = newBasicJava.findMax(newArray).toString();
        String six = newBasicJava.findMax(newArray2).toString();
        // System.out.println(five);
        // System.out.println(six);
        //6.
        String seven = newBasicJava.findAvg(newArray).toString();
        String eight = newBasicJava.findAvg(newArray2).toString();
        // System.out.println(seven);
        // System.out.println(eight);
        //7.
        ArrayList nine = newBasicJava.printOneTo255OddArray(255);
        // System.out.println(nine);
        //8.
        String ten = newBasicJava.greaterThanY(newArray, 5);
        // System.out.println(ten);
        //9.
        int [] newArray1 = {1, 5, 10, -2};
        String eleven = newBasicJava.squareTheValues(newArray1);
        // System.out.println(eleven);
        //10.
        int [] newArray3 = {1, 5, 10, -2};
        String twelve = newBasicJava.eleminateNegativeNumber(newArray3);
        // System.out.println(twelve);
        //11.
        int [] newArray11 = {1,3,5,7,9,13};
        int [] newArray12 = {-3,-5,-7};
        int [] secondLast1 = newBasicJava.findMaxMinAvg(newArray11);
        int [] secondLast2 = newBasicJava.findMaxMinAvg(newArray12);
        System.out.println(secondLast1);
        System.out.println(secondLast2);
        //12. Shifting the Values in the Array
        int [] newArray13 = {1,3,5,7,9,13};
        int [] newArrayLast = newBasicJava.shiftValuesArray(newArray13);
        System.out.println(newArrayLast);
    }
}