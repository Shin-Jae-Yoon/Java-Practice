package chap09;

import java.io.File;
import java.io.IOException;

public class TempFile {
    public static void main(String[] args) {
        try {
            File f = File.createTempFile("tmp_", ".dat");
            System.out.println(f.getAbsolutePath());
            System.out.println("10초 동안 멈춰있습니다.");

            try {
                Thread.sleep(10000); // 10초 동안 프로그램 멈춤
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            f.deleteOnExit();   // JVM이 종료될 때 임시파일을 자동으로 삭제
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
