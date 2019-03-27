package java8.stream;

import java.util.ArrayList;
import java.util.List;

public class ModifySourceInStream {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        for (int i=0;i < 10; i++) {
            users.add(new User(i));
        }
        users.stream().forEach(u -> u.setName(1));
        users.stream().forEach(u -> System.out.println(u.getName()));
        users.stream().forEach(u -> users.remove(u));
    }
}
