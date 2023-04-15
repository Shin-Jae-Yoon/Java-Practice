package chap09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardIOExam {
    public static void main(String[] args) throws IOException {
        // 키보드로부터 한 줄씩 입력받고, 한 줄씩 화면에 출력하시오.
        // 키보드 : System.in (주인공), InputStream 타입
        // 화면 : System.out (주인공, OutputStream 타입
        // 키보드로 입력받는다는 것은 문자를 입력받는 것 : char 단위 입출력
        // char 단위 입출력 클래스는 Reader, Writer
        // 한 줄 읽기 : BufferedReader라는 클래스는 readLine이라는 메서드를 가지고 있다.
        //           더 이상 읽어들일 것이 없으면 (EOF) null을 반환
        // 한 줄 쓰기 : PrintStream, PrintWriter

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println("읽어들인 값 : " + line);
        }
    }
}
