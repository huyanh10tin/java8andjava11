package java8.optionaldemo;

public class Optional {
    public static void main(String[] args) {
        /*Optional str = Optional.of(null);*/
        /*System.out.println(str.isEmpty());*/
        System.out.println(java.util.Optional.ofNullable(null));
        String s = "x";
        System.out.println(s.repeat(-1));
    }
}
