public class prog9 {
      public static void main(String[] args) {
        int primitiveInt = 100;
      Integer boxedInt = primitiveInt;
       System.out.println("Autoboxing:");
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Boxed Integer object: " + boxedInt);
        Integer objectInteger = new Integer(200);
        int unboxedInt = objectInteger;

        System.out.println("\nUnboxing:");
        System.out.println("Integer object: " + objectInteger);
        System.out.println("Unboxed primitive int: " + unboxedInt);
    }
}
