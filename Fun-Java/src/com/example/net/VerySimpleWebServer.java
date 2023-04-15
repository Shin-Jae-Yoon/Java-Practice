package com.example.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class VerySimpleWebServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(9090);

        System.out.println("클라이언트 접속 대기중 ...");
        Socket socket = ss.accept();

        InputStream in = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String firstLine = br.readLine();
        List<String> headers = new ArrayList<>();
        String line = null;

        // 빈 줄을 만나면 while문 종료
        while (!(line = br.readLine()).equals("")) {
            headers.add(line);
        }

        System.out.println(firstLine);
        for (int i = 0; i < headers.size(); i++) {
            System.out.println(headers.get(i));
        }

        // 서버가 클라이언트에게 응답메시지 보내기
        OutputStream out = socket.getOutputStream();
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
        pw.println("HTTP/1.1 200 OK");
        pw.println("name : shin jae yoon");
        pw.println("email : jaeyoon@email.com");
        pw.println();
        pw.println("<html>");
        pw.println("<h1>Hello!!!</h1>");
        pw.println("</html>");
        pw.close();

        System.out.println(socket.toString());

        ss.close();
        System.out.println("서버가 종료됩니다 ...");
    }
}
