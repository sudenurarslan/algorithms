public class ReverseString {
    public static void main(String[] args) {
        String input = "Sude";
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        StringBuilder reversedStr = new StringBuilder(str);
        reversedStr.reverse();
        return reversedStr.toString();
    }
}
