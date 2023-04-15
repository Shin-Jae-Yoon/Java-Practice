package chap09;

import java.io.ByteArrayOutputStream;

public class HelloIO09 {
    public static void main(String[] args) throws Exception {
        int data1 = 1;
        int data2 = 2;
        // 메모리 상에 저장한다
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(data1);   // data1의 마지막 1 byte만 저장
        out.write(data2);   // data2의 마지막 1 byte만 저장
        out.close();

        byte[] array = out.toByteArray();
        System.out.println(array.length);
        System.out.println(array[0]);
        System.out.println(array[1]);
    }
}
