package java11.filedemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class File {
    public static void main(String[] args) throws IOException {
        Path path = Files.writeString(Path.of("F:\\test.txt"), "huyanh!");// ghi chuoi huy anh vao File test.txt

        String content = Files.readString(Path.of("F:\\test.txt"));
        System.out.println(content);// huyanh !

    }
}
