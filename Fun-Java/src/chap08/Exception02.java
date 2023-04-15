package chap08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception02 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("Exception5.java");
    }
}
