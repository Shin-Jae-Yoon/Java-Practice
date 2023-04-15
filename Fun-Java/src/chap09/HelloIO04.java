package chap09;

import java.io.FileReader;
import java.io.Reader;

public class HelloIO04 {
    public static void main(String[] args) throws Exception {
        Reader in = new FileReader("/Users/jaeyoon/Desktop/hello.txt");
        int ch = -1;
        while ((ch = in.read()) != -1) {
            System.out.println((char)ch);
        }
        in.close();
    }
}
