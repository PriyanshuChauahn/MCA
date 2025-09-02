public class prog7 {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;
    String str; 
    void printDefault() {
        System.out.println("Default byte: " + b);
        System.out.println("Default short: " + s);
        System.out.println("Default int: " + i);
        System.out.println("Default long: " + l);
        System.out.println("Default float: " + f);
        System.out.println("Default double: " + d);
        System.out.println("Default char: [" + c + "]"); // May appear empty
        System.out.println("Default boolean: " + bool);
        System.out.println("Default String: " + str); // null
    }
    public static void main(String[] args) {
        prog7 obj = new prog7();
        obj.printDefault();
    }
}
