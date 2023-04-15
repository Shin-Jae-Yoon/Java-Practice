package chap09;

import java.io.IOException;
import java.io.InputStream;

/*
txt 파일로부터 한 줄씩 입력받아 화면에 출력한다.
키보드로부터 한 줄씩 입력받아 파일에 출력한다.
txt 파일로부터 한 줄씩 입력받아 다른 파일에 한 줄씩 출력한다.
 */

public class InputStreamExam01 {
    public static void main(String[] args) {
        InputStream in = null;
        try {
            int data = in.read();
        } catch (IOException e) {
            System.out.println("io 오류 : " + e);
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                System.out.println("io 오류 : " + e);
            }
        }
    }
}
