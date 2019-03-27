package java11.lambda;

import java.util.stream.IntStream;

public class Lambda {
    public static void main(String[] args) {
        //java11.var
        IntStream.of(1, 2, 3, 5, 6, 7)
                .filter((var i) -> i % 2 == 0)
                .forEach(System.out::println);

        //no java11.var
        IntStream.of(1, 2, 3, 5, 6, 7)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
    }
}

