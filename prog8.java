public class prog8 {
      public static void main(String[] args) {
        int intVal = 100;
        long longVal = intVal;        
        float floatVal = longVal;     

        System.out.println("Implicit Type Casting:");
        System.out.println("int value: " + intVal);
        System.out.println("Converted to long: " + longVal);
        System.out.println("Converted to float: " + floatVal);
        double doubleVal = 99.99;
        int castedInt = (int) doubleVal;  
        char castedChar = (char) castedInt; 
       System.out.println("\nExplicit Type Casting:");
        System.out.println("double value: " + doubleVal);
        System.out.println("Converted to int: " + castedInt);
        System.out.println("Converted to char: " + castedChar);
    }
}
