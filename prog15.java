public class prog15 {
        public static void main(String[] args) {
        int primitiveA = 10;
        int primitiveB = primitiveA;  
         primitiveB = 20;
       System.out.println("Primitive Variables:");
        System.out.println("primitiveA = " + primitiveA); 
        System.out.println("primitiveB = " + primitiveB); 
        int[] referenceA = {10, 20, 30};
        int[] referenceB = referenceA;  
        referenceB[0] = 99;
      System.out.println("\nReference Variables:");
        System.out.println("referenceA[0] = " + referenceA[0]); 
        System.out.println("referenceB[0] = " + referenceB[0]); 
    }
}


