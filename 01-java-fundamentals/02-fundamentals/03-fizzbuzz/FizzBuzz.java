public class FizzBuzz {
    String resultsPage = "";
    public String fizzBuzz(int number) {
        for(int index = 0; index <= number; index++) {
            if(index % 3 == 0) {
                if(index % 5 == 0) {
                    String outPutLine1 = String.format("Number - %d - %s", index, "Fizz Buzz\n");
                    resultsPage += outPutLine1;
                } else {
                    String outPutLine2 = String.format("Number - %d - %s", index, "Fizz\n");
                    resultsPage += outPutLine2;
                }
            } else if(index % 5 == 0) {
                String outPutLine3 = String.format("Number - %d - %s", index, "Buzz\n");
                resultsPage += outPutLine3;
            } else {
                String outPutLine4 = String.format("Number - %d - %s", index, "Singularity to Fizz Buzz\n");
                resultsPage += outPutLine4;
            }
        } return resultsPage;
    } 
}
