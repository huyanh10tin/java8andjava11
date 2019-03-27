package java8.innerclass;
interface Eat{
    void eat();
}
public class Anymous2 {
    public static void main(String[] args) {
        Eat e = new Eat() {
            public void eat() {
                System.out.println("eating");
            }
        };
        e.eat(); // eating
    }
}
