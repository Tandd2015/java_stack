import java.util.ArrayList;

public class BasicJava {
    String resultsPage1 = "";
    String resultsPage2 = "";
    String resultsPage3 = "";
    String resultsPage4 = "";
    String resultsPage5 = "";
    String resultsPage6 = "";
    ArrayList<Integer> two = new ArrayList<Integer>();

    // Print 1-255
    public String printOneTo255(int number) {
        for (int i = 1; i <= number; i++) {
            resultsPage1 += String.format("%s %s",Integer.toString(i),"\n");
        }
        return resultsPage1;
    };
    // Print 1-255 odd
    public String printOneTo255Odd(int number) {
        for (int i = 1; i <= number; i++) {
            if(i % 2 == 1){
                resultsPage2 += String.format("%s %s",Integer.toString(i),"\n");
            }
        }
        return resultsPage2;
    };
    // print sum
    public String printSum(int number) {
        int sum = 0;
        for(int i = 1; i <= number; i++) {
            sum+=i;
            resultsPage3 += String.format("New number: %d Sum: %d %s", i, sum, "\n");
        }
        return resultsPage3;
    }
    // Iterating through an array
    public String say(int[] arr){
        int i = 0;
        while(i < arr.length) {
            resultsPage4 += String.format("%s %s", Integer.toString(arr[i]), "\n");
            i++;
        }
        return resultsPage4;
    }
    // find max
    public Integer findMax(int[] arrList) {
        int max = arrList[0];
        for(int i = 1; i < arrList.length; i++){
            if(arrList[i] < 0  && max < 0 ){
                max = arrList[i];
            } else{
                if(arrList[i] > max){
                    max = arrList[i];
                }
            }
        }
        return max;
    }
    // get average
    public Integer findAvg(int[] arrList) {
        int sum = arrList[0];
        int avg = 0;
        for(int i = 1; i < arrList.length; i++){
            sum += arrList[i];
        }
        avg = sum /arrList.length;
        return avg;
    }
    // Array with Odd Numbers
    public ArrayList printOneTo255OddArray(int number) {
        for (int i = 1; i <= number; i++){
            if(i % 2 == 1){
                two.add(i);
            }
        }
        return two;
    }
    // greater than y
    public String greaterThanY(int[] x, int y) {
        int count = 0;
        for(int value: x ){
            if(value > y){
                count+=1;
            }
        }
        return Integer.toString(count);
    }
    // square the values
    public String squareTheValues(int[] x) {
        for(int i = 0; i < x.length; i++) {
            x[i] = x[i] * x[i];
            resultsPage5 += String.format("%s %s", Integer.toString(x[i]), "\n");
        }
        return resultsPage5;
    }
    // eleminating Negative Numbers
    public String eleminateNegativeNumber(int[] b) {
        for(int i = 0; i < b.length; i++) {
            if(b[i] < 0) {
                b[i] = 0;
            }
            resultsPage6 += String.format("%s %s", Integer.toString(b[i]), "\n");
        }
        return resultsPage6;
    }
    // Max Min Average
    public int [] findMaxMinAvg(int[] arrList) {
        int max = arrList[0];
        int min= arrList[0];
        int sum = arrList[0];
        int avg = 0;
        for(int i = 1; i < arrList.length; i++){
            if(arrList[i] < 0  && max < 0 ){
                max = arrList[i];
            } else{
                if(arrList[i] > max) {
                    max = arrList[i];
                }
            }

            if(arrList[i] < min) {
                min = arrList[i];
            }

            sum+=arrList[i];
        }
        avg = sum/arrList.length;
        // System.out.println(max);
        // System.out.println(min);
        // System.out.println(avg);
        int [] dynamicArray = {max, min, avg};
        return dynamicArray;
    }

    // Shifting the Values in the Array
    public int[] shiftValuesArray(int[] arr1) {
        int [] myArray = new int[arr1.length-1];
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] == arr1[0]){
                continue;
            } else if (arr1[i] != arr1[0] && arr1[i] != arr1[arr1.length-1]) {
                myArray[i-1] = arr1[i];
            } else if (arr1[i] == arr1[arr1.length-1]) {
                myArray[i-1] = 0;
                break;
            }else {
                continue;
            }
        }
        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
        return myArray;
    }
}
