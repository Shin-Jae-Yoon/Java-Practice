package com.example.net.webserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    public static void main(String[] args) throws Exception {
        // 클라이언트가 접속할 때까지 대기
        ServerSocket serverSocket = new ServerSocket(10000);
        // 클라이언트가 접속하면 클라이언트와 통신하는 clientSocket 반환
        System.out.println("1 - 클라이언트 접속 대기");

        try {
            while (true) {
                Socket clientSocket = serverSocket.accept();

                ClientThread ct = new ClientThread(clientSocket);
                ct.start();
            }
        } finally {
            serverSocket.close();
        }
    }
}

class ClientThread extends Thread {
    private Socket clientSocket;

    public ClientThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    public void run() {
        try {
            InputStream inputStream = clientSocket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

            OutputStream out = clientSocket.getOutputStream();
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));

            System.out.println("2 - 클라이언트 접속 성공");

            String firstLine = br.readLine();
            String msg = "";
            if (firstLine.indexOf("/hello") >= 0) {
                msg = "hello";
            }
            else if (firstLine.indexOf("/hi") >= 0) {
                msg = "hi";
            }
            System.out.println(firstLine);

            String line = null;
            while (!(line = br.readLine()).equals("")) {
                System.out.println(line);
            }

            System.out.println("3 - 응답한다.");

            pw.println("HTTP/1.1 200 OK");
            pw.println("name : shin jae yoon");
            pw.println("email : jaeyoon@email.com");
            pw.println();
            pw.println("<html>");
            pw.println(firstLine + "!!!");
            pw.println("</html>");

            pw.flush();
            br.close();
            pw.close();
            clientSocket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
