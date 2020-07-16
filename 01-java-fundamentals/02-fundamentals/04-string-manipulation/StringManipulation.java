public class StringManipulation {

    public String trimAndConcat(String stringOne, String stringTwo){
        String endString = String.format("String1: %s, String2: %s", stringOne.trim(), stringTwo.trim());
        return endString;
    }

    public Integer getIndexOrNull(String newString, char newChar){
        Integer endString = newString.indexOf(newChar);
        if(endString < 0) {
            return endString = null;
        } else {
            return endString;
        }
    }
    public Integer getIndexOrNull(String mainString, String indexString){
        Integer endString = mainString.indexOf(indexString);
        if(endString < 0) {
            return endString = null;
        } else {
            return endString;
        } 
    }

    public String concatSubstring(String focusString, int startStrInt, int endStrInt, String endStrPiece){
        String endString = String.format("%s%s", focusString.substring(startStrInt, endStrInt), endStrPiece);
        return endString;
    }
}