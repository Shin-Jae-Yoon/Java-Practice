package chap09;

import java.io.FileInputStream;
import java.io.InputStream;

public class HelloIO02 {
    public static void main(String[] args) throws Exception {
        InputStream in = new FileInputStream("/Users/jaeyoon/Desktop/hello01.dat");
        int buf = -1;
        while ((buf = in.read()) != -1) {
            System.out.println(buf);
        }
        in.close();
    }
}
