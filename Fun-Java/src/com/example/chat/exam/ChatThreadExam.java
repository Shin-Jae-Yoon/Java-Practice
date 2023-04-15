package com.example.chat.exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class ChatThreadExam extends Thread {
    private Socket socket;
    private List<PrintWriter> outList;
    private PrintWriter out;
    private BufferedReader in;

    public ChatThreadExam(Socket socket, List<PrintWriter> outList) {
        this.socket = socket;
        this.outList = outList;

        // 1. socket 으로부터 읽어들일 수 있는 객체를 얻는다.
        // 2. socket 에게 쓰기 위한 객체를 얻는다.
        //    (현재 연결된 클라이언트에게 쓰는 객체)
        try {
            out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            outList.add(out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run() {
        // 3. 클라이언트가 보낸 메시지를 읽는다.
        // 4. 접속된 모든 클라이언트에게 메시지를 보낸다.
        //    (현재 접속된 모든 클라이언트에게 쓸 수 있는 객체가 필요)

        String line = null;

        try {
            // 접속한 모든 클라이언트에게 메시지 전송
            while ((line = in.readLine()) != null) {
                for (int i = 0; i < outList.size(); i++) {
                    PrintWriter o = outList.get(i);
                    o.println(line);
                    o.flush();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally { // 접속이 끊어질 때
            try {
                outList.remove(out);
            } catch (Exception e) {
                e.printStackTrace();
            }

            for (int i = 0; i < outList.size(); i++) {
                PrintWriter o = outList.get(i);
                o.println("어떤 클라이언트가 접속이 끊어졌어요.");
                o.flush();
            }

            try {
                socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
