import java.util.Scanner;
public class prog19 {
      public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a long value: ");
     long longValue = scanner.nextLong();       
      float floatValue = (float) longValue;
        long convertedBack = (long) floatValue;

        System.out.println("Float value after conversion: " + floatValue);
        System.out.println("Long value after converting back from float: " + convertedBack);
        if (longValue == convertedBack) {
            System.out.println("The long value can be safely stored in a float.");
        } else {
            System.out.println(" Precision loss, The long value cannot be stored exactly in a float.");
        }
scanner.close();
    }
}

