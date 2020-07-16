import java.util.ArrayList;

public class FirstJavaProgram {
    public static void main(String[] args) {
        String stringName = "My name is Daniel";
        String stringAge = "I am 32 years old";
        String stringResidence = "My hometown is Continental, OH";
        String[] strings = {stringName, stringAge, stringResidence};

        for(String value: strings) {
        System.out.println(value);
        }
        
        System.out.println(stringName);
        System.out.println(stringAge);
        System.out.println(stringResidence);
    }
}
                            // System.out.println(daAge[0].concat("world"));
    // Object[] stringAge = {"My age is", 32, "years old"};
    // daAge.add("My age is");
    // Integer age = new Integer(32);
    // daAge.add(age.toString());
    // daAge.add("years old");