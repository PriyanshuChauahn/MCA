public class prog17 {
        public static void main(String[] args) {
        var number = 10;              
        var name = "Java";            
        var pi = 3.14159;
        var isJavaFun = true;
        var numbers = new int[]{1, 2, 3}; 
        System.out.println("number (int): " + number);
        System.out.println("name (String): " + name);
        System.out.println("pi (double): " + pi);
        System.out.println("isJavaFun (boolean): " + isJavaFun);
        System.out.print("numbers (int[]): ");
        for (var n : numbers) {
            System.out.print(n + " ");
        }
        var message = new StringBuilder("Hello");
        message.append(" World!");
        System.out.println("\nmessage (StringBuilder): " + message);
}
}

