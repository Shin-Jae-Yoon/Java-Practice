package com.example.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("사용법 : 닉네임 설정");
            return;
        }

        String name = args[0];
        Socket socket = new Socket("127.0.0.1", 8888);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // 닉네임 전송
        pw.println(name);
        pw.flush();

        // 백그라운드로 서버가 보내준 메시지를 읽어서 화면에 출력
        ClientInputThread clientInputThread = new ClientInputThread(br);
        clientInputThread.start();

        // 클라이언트트 읽어들인 메시지를 서버에게 전송
        try {
            String line = null;
            while ((line = keyboard.readLine()) != null) {
                if ("/quit".equals(line)) {
                    break;
                }
                pw.println(line);
                pw.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            socket.close();
        }
    }
}
