package java8.functioninterface;

import java.util.function.Supplier;

public class SubppliersDemo {
    public static void main(String[] args) {
        Supplier<Person> personSupplier = Person::new;
        personSupplier.get();   // new Person
    }
}
