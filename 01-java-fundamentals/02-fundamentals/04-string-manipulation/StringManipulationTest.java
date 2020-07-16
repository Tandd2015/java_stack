public class StringManipulationTest {
    public static void main(String[] args){
        
        //1.
        StringManipulation manipulator = new StringManipulation();
        
        String str = manipulator.trimAndConcat("    Hello   ","    World    ");
        
        System.out.println(str);
        
        //2.
        StringManipulation manipulator1 = new StringManipulation();
        
        char letter ='o';
        
        Integer a = manipulator1.getIndexOrNull("Coding", letter);
        Integer b = manipulator1.getIndexOrNull("Hello World", letter);
        Integer c = manipulator1.getIndexOrNull("Hi", letter);

        System.out.println(a); //1
        System.out.println(b); //4
        System.out.println(c); //null

        //3.
        StringManipulation manipulator2 = new StringManipulation();
        
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        
        Integer d = manipulator2.getIndexOrNull(word, subString);
        Integer e = manipulator2.getIndexOrNull(word, notSubString);
        
        System.out.println(d); // 2
        System.out.println(e); // null

        //4.
        StringManipulation manipulator3 = new StringManipulation();
        String word2 = manipulator3.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word2); // eworld



    }
}