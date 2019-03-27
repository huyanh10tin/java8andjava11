package java8.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) throws IOException {
        ProcessHandle curentProces = ProcessHandle.current();
        System.out.println("current process id: " + curentProces.pid());
        BufferedReader readerBuf = new BufferedReader(new FileReader("F:\\test.txt"));
        try (readerBuf){
            while(readerBuf.ready()) {
                System.out.println(readerBuf.readLine());

            }
        }
    }
}
