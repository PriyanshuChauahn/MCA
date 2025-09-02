public class prog13 {
    static int staticCount = 0;
    int instanceCount = 0;
    void incrementCounts() {
        staticCount++;
        instanceCount++;
    }
    void displayCounts(String objectName) {
        System.out.println("[" + objectName + "] staticCount = " + staticCount + ", instanceCount = " + instanceCount);
    }
 public static void main(String[] args) {
   prog13 obj1 = new prog13();
    obj1.incrementCounts();
       obj1.displayCounts("obj1");
        prog13 obj2 = new prog13();
        obj2.incrementCounts();
        obj2.displayCounts("obj2");
        prog13 obj3 = new prog13();
        obj3.incrementCounts();
        obj3.displayCounts("obj3");
    }
}
