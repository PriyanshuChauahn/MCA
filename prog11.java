public class prog11 {
      public static void main(String[] args) {
        char letter = 'A';
        String word = "Apple";
        System.out.println("char variable (single character): " + letter);
        System.out.println("String variable (multiple characters): " + word);
        System.out.println("\n--- Additional Info ---");

        int asciiValue = letter;  // Implicitly cast to int
        System.out.println("ASCII value of char '" + letter + "' is: " + asciiValue);
        System.out.println("Length of String \"" + word + "\" is: " + word.length());
    }
}
