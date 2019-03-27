package java8.optionaldemo;

public class NoOptional {
    public static void main(String args[]) {
        Integer a = null;
        Integer b = new Integer(10);
        System.out.println(sum(a, b)); // 10
    }
    public static Integer sum(Integer a, Integer b) {
        Integer value1 = (a == null) ? 0 : a;
        Integer value2 = (b == null) ? 0 : b;
        return value1 + value2;
    }
}
