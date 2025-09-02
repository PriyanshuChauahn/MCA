public class prog4 {
       public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a + b; // a becomes 15
        b = a - b; // b becomes 5 (15 - 10)
        a = a - b; // a becomes 10 (15 - 5)
         System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
