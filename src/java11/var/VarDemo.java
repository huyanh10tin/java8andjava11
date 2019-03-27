package java11.var;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class VarDemo {
    public static void main(String[] args) throws Exception{
        //java11.var
        IntStream.of(1, 2, 3, 5, 6, 7)
                .filter((var i) -> i % 2 == 0)
                .forEach(System.out::println);
    }
}
