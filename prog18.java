public class prog18 {
       public static void main(String[] args) {
        byte b = 127; 
        System.out.println("Original byte value: " + b);
        b++;  
        System.out.println("After overflow (byte): " + b); 
        int i = Integer.MAX_VALUE; 
        System.out.println("\nOriginal int value: " + i);
          i++;  
        System.out.println("After overflow (int): " + i); 
        long l = Long.MAX_VALUE; 
        System.out.println("\nOriginal long value: " + l);
        l++;  
      System.out.println("After overflow (long): " + l); 
    }
}
