package ss13_search_algorithm.exercise13;

public class FindStringLargest {

    static String stringLargest(String string) {
        String stringLargest = "";
        stringLargest+=string.charAt(0);
        for (int i=0; i<string.length()-1; i++ ) {
            if (string.charAt(i) < string.charAt(i+1)) {
                stringLargest+=string.charAt(i+1);
            }
        }
        return stringLargest;
    }

    public static void main(String[] args) {
        System.out.println(stringLargest("Welcome"));
    }
}
