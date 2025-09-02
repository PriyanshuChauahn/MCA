public class prog12 {
         public static void main(String[] args) {
        byte b = 10;
        byte b2 = 20;
        // byte result = b + b2; 
        int result1 = b + b2;
        char c = 'A';               
        int result2 = c + 1;        
        int i = 100;
        long l = 200L;
        long result3 = i + l;      
        float f = 10.5f;
        double d = 20.25;
        double result4 = f + d;     
        System.out.println("Result of byte + byte (promoted to int): " + result1);
        System.out.println("Result of char + int (char promoted to int): " + result2);
        System.out.println("Result of int + long (int promoted to long): " + result3);
        System.out.println("Result of float + double (float promoted to double): " + result4);
    }
}
