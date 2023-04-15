package chap09;

import java.io.StringWriter;

public class HelloIO11 {
    public static void main(String[] args) throws Exception {
        StringWriter out = new StringWriter();
        out.write("hello");
        out.write("world");
        out.write("!!!");
        out.close();

        String str = out.toString();
        System.out.println(str);
    }
}
