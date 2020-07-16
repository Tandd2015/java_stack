import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PuzzleJava {
    //1.
    public ArrayList<Integer> printSum(int[] n) {
        String printSumResults = "";
        ArrayList<Integer> arraySumResults = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
            printSumResults += String.format("Value: %d Sum: %d, %s", n[i], sum, "\n");
            if (n[i] > 10) {
                arraySumResults.add(n[i]);
            }
        }
        System.out.println(printSumResults);
        // System.out.println(arraySumResults.toString());
        return arraySumResults;
    }
    //2.
    public ArrayList<String> shuffleString(String[] shuffles) {
        ArrayList<String> arrayStringer = new ArrayList<String>();
        ArrayList<String> arraySelect = new ArrayList<String>();
        for (int i = 0; i < shuffles.length; i++) {
            arrayStringer.add(shuffles[i]);
            Collections.shuffle(arrayStringer);
            if (shuffles[i].length() > 5) {
                arraySelect.add(shuffles[i]);
            }
        }
        System.out.println(arrayStringer.toString());
        System.out.println(arraySelect.toString());
        return arraySelect;
    }
    // 3.
    public ArrayList<Character> alphaL(char[] a) {
        ArrayList<Character> arrTry1 = new ArrayList<Character>();
        for(char value : a){
            arrTry1.add(value);
            Collections.shuffle(arrTry1);
        }
        char letterTwenty6 = arrTry1.get(25);
        System.out.println(letterTwenty6);
        char letterOne = arrTry1.get(0);
        if(letterOne == 'u' || letterOne == 'o' || letterOne == 'e' || letterOne =='a' || letterOne == 'i'){
            System.out.println(letterOne);
            String message = "We are five little items of an everyday sort and we all can be found on (A TEnnIs cOUrt)";
            System.out.println(message);
        } else {
            System.out.println(letterOne);
        }
        return arrTry1;
    }
    // 3.
    public char[] alphaL2(char[] b){
        Random variable = new Random();
        for(int i = 0; i <b.length/2; i++){
            Character temp = b[i];
            int randomIndex = variable.nextInt(b.length - i) + i;
            b[i] = b[randomIndex];
            b[randomIndex] = temp;
        }
        System.out.println(b[25]);
        char letters = b[0];
        if(letters == 'u' || letters == 'o' || letters == 'e' || letters =='a' || letters == 'i'){
            System.out.println(letters);
            String message1 = "We are five little items of an everyday sort and we all can be found on (A TEnnIs cOUrt)";
            System.out.println(message1);
        } else {
            System.out.println(letters);
        }
        return b;
    }
    //4.
    public int[] genRanArr(int arrayLen , int rNStart, int rNEnd) {
        int[] myArray1 = new int[arrayLen];
        Random genNum = new Random();
        for(int i = 0; i < arrayLen; i++) {
            myArray1[i] = genNum.nextInt(rNEnd) + rNStart;
            // System.out.println(myArray1[i]);
        }
        return myArray1;
    }
    //5.
    public int[] genRanArrSort(int arrayLen , int rNStart, int rNEnd) {
        int[] myArray2 = new int[arrayLen];
        Random genNum4 = new Random();
        for(int i = 0; i < arrayLen; i++) {
            myArray2[i] = genNum4.nextInt(rNEnd) + rNStart;
            // System.out.println(myArray2[i]);
        }
        Arrays.sort(myArray2);
        // for(int i = 0; i < arrayLen; i++) {
        //     System.out.println(myArray2[i]);
        // }
        return myArray2;
    }

    public ArrayList<Integer> genRanArrSort1(int arrayLen , int rNStart, int rNEnd) {
        ArrayList<Integer> myArray3 = new ArrayList<Integer>();
        Random genNum3 = new Random();
        
        for(int db = 0; db < arrayLen; db++) {
            int value = genNum3.nextInt(rNEnd) + rNStart;
            myArray3.add(value);
            // System.out.println(value);
        }

        Collections.sort(myArray3);
        
        int min = myArray3.get(0);
        int max = myArray3.get(myArray3.size()-1);
        String message23 = String.format("Min: %d Max: %d", min, max);

        System.out.println(myArray3);
        System.out.println(message23);
        return myArray3;

    }
    //6.
    public String genRanStr(int lenStrSet){
        String ranString = "";
        String dict = "abcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]|}{';:?/.,<>`~";
        Random variable2 = new Random();
        
        for(int times = 0; times < lenStrSet; times++) {
            ranString+=dict.charAt(variable2.nextInt(dict.length()-1 + 1));
        }
        // System.out.println(ranString);
        return ranString;
    }
    //7.
    public String[] genRanStrArr(int lenStrSet, int lenStrArr){
        String[] ranStringArr = new String[lenStrArr];
        String ranString = "";
        String dict = "abcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]|}{';:?/.,<>`~";
        Random variable2 = new Random();
        for(int time = 0; time < lenStrArr; time++) {
            for(int times = 0; times < lenStrSet; times++) {
                ranString+=dict.charAt(variable2.nextInt(dict.length()-1 + 1));
            }
            ranStringArr[time] = ranString;
            System.out.println(ranStringArr[time]);
            ranString = "";
        }
        // System.out.println(ranString);
        return ranStringArr;
    }
}