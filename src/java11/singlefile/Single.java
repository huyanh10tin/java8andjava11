package java11.singlefile;

public class Single {
    public static void main(String[] args) {
        System.out.println("hello world !");
        long creditCardNumber = 1234_5678_9012_3456L;

        int x2 = 5_2;              // OK (decimal literal)
        int x4 = 5_______2;        // OK (decimal literal)

        int x7 = 0x5_2;            // OK (hexadecimal literal)

        int x9 = 0_52;             // OK (octal literal)
        int x10 = 05_2;            // OK (octal literal)
    }
}
