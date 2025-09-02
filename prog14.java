import java.util.Scanner;
public class prog14 {
         public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a decimal number: ");
        int number = scanner.nextInt();
        String binary = Integer.toBinaryString(number);
        String hex = Integer.toHexString(number);
        String octal = Integer.toOctalString(number); 
        System.out.println("Binary representation: " + binary);
        System.out.println("Hexadecimal representation: " + hex);
        System.out.println("Octal representation: " + octal);
        scanner.close();
    }
}
