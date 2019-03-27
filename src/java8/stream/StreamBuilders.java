package java8.stream;

import java11.lambda.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBuilders
{
    public static void main(String[] args)
    {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(p -> System.out.println(p));

        Stream<Integer> stream2 = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        stream2.forEach(p -> System.out.println(p));

        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        Stream<Integer> stream3 = list.stream();
        List<Integer> evenNumbersList = stream3.filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.print(evenNumbersList);


        Function<String, List<String>> createString = (String x) -> Arrays.asList(x.split(""));
        createString.apply("1234567890").forEach(System.out::println);


    }
}