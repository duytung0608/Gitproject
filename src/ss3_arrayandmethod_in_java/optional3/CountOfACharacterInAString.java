package ss3_arrayandmethod_in_java.optional3;

public class CountOfACharacterInAString {
    public static void main(String[] args) {
        String string = "CodegymC";
        char characters = 'C';
        int count = 0;
        for (int i=0;i<string.length();i++) {
            if (string.charAt(i) == characters) {
                count++;
            }
        }
        System.out.println("Count is: " + count);
    }
}
