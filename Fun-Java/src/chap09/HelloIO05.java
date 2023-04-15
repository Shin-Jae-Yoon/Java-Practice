package chap09;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class HelloIO05 {
    public static void main(String[] args) throws Exception {
        /*
        FileOutputStream은 "/Users/jaeyoon/Desktop/my.txt"에 저장
        FileOutputStream은 write(int); int의 마지막 byte만 저장
        OutputStreamWriter는 생성자에 들어온 OutputStream의 write()를 이용하여야 한다.
        OutputStreamWriter는 write(int); int의 끝부분 char를 저장
        PrintWriter는 생성자에 들어온 OutputStreamWriter의 write() 메서드를 이용하여야 한다.
        PrintWriter는 println(문자열); 문자열을 출력
         */
        PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream("/Users/jaeyoon/Desktop/my.txt")));
        out.println("hello");
        out.println("world");
        out.println("!!!!");
        out.close();
    }
}
