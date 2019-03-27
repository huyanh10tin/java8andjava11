package java11.stringdemo;

public class StringDemo {
    public static void main(String[] args) {
        String test = "1 java8 \n2java9 \njava10 \njava11\n";
        System.out.println( test.trim());
        System.out.println("====================");

        System.out.println( test.strip());
        Boolean isBlank = test.isBlank();
        String result = test.lines().filter(p -> "java11".equals(p)).findFirst().orElse("Not found!");
        System.out.println(result); // java11
        String test2 = "     ";
        System.out.println(test2.repeat(2));
        System.out.println(test2.isBlank());
        System.out.println(test2.isEmpty());
    }
}
