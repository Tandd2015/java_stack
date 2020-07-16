import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Test {
    
    public static void main(String[] args) {
        PuzzleJava puzzalier = new PuzzleJava();
        // example variables
        int[] manyNewName = {3,5,1,2,7,9,8,13,25,32};
        String[] nameDirect = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        //1.
        ArrayList<Integer> anwserOne = puzzalier.printSum(manyNewName);
        System.out.println(anwserOne);
        //2.
        ArrayList<String> anwserTwo = puzzalier.shuffleString(nameDirect);
        System.out.println(anwserTwo);
        //3.
        char[] alphaBetaS = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',};
        ArrayList<Character> anwserThree = puzzalier.alphaL(alphaBetaS);
        System.out.println(anwserThree.toString());
        char[] returnAlpha = puzzalier.alphaL2(alphaBetaS);
        System.out.println(returnAlpha);
        //4.
        int arrayLen = 10;
        int rNStart = 55;
        int rNEnd = 45;
        int[] newRandomArr = puzzalier.genRanArr(arrayLen, rNStart, rNEnd);
        System.out.println(newRandomArr);
        //5.
        int[] newRandomArrSort = puzzalier.genRanArrSort(arrayLen, rNStart, rNEnd);
        System.out.println(newRandomArrSort);
        ArrayList<Integer> newRandomArrSort1 = puzzalier.genRanArrSort1(arrayLen, rNStart, rNEnd);
        System.out.println(newRandomArrSort1);
        //6.
        int lenStrSet = 5;
        String newRanString = puzzalier.genRanStr(lenStrSet);
        System.out.println(newRanString);
        //7.
        int lenStrArr = 10;
        int lenStrSet2 = 5;
        String[] newRanString2 = puzzalier.genRanStrArr(lenStrSet2, lenStrArr);
        System.out.println(newRanString2);
    }
}