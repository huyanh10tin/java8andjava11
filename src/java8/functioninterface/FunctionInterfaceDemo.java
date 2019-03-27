package java8.functioninterface;
@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}
public class FunctionInterfaceDemo {
    public static void main(String[] args) {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);    // 123

        Converter<String, Integer> converter1 = Integer::valueOf;
        Integer converted1 = converter.convert("123");
        System.out.println(converted1);   // 123
    }
}
