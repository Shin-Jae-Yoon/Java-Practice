package com.example.chat.exam;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChatServerExam {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);

        // 공유 객체에서 스레드에 안전한 리스트를 생성
        // 스레드 객체가 생성될 때마다 while 문 밖의 outList를 생성자로 하나씩 넣어줌
        // 스레드가 10개 생성되면, outList라는 하나의 객체를 공유!!
        List<PrintWriter> outList = Collections.synchronizedList(new ArrayList<>());

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("접속 : " + socket);

            ChatThreadExam chatThread = new ChatThreadExam(socket, outList);
            chatThread.start();
        }
    }
}