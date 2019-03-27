package java11.singlefile;

import java.time.LocalDate;
import java.util.Optional;
import java.util.stream.Stream;

public class Single2 {
    public static void main(String[] args) {
      /*  Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("A");
                })
                .forEach(s -> System.out.println("forEach: " + s));*/
        var x = Optional.ofNullable(Integer.valueOf(222)).orElse(0);
        System.out.println(x);
        if(x instanceof Integer) {
            System.out.println("integer do");
        }
        System.out.println(LocalDate.of(2019,12,01));
        Stream<String> sStreamStr = Stream.of("11", "12", "14", "15", "34");

    }
}
